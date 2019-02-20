package com.liyafeng.videoex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /**
     * ============从git上拉取ijk的源码========
     * https://github.com/bilibili/ijkplayer
     *
     * 里面有example，可以运行，下载ndk，file->project structure 下载ndk
     *
     * 然后gradle中 需要把 all64Compile 改成compile
     *
     *
     *
     * ============ijk加载so=================
     *  Process: tv.danmaku.ijk.media.example, PID: 32695
     *     java.lang.UnsatisfiedLinkError: dalvik.system.PathClassLoader[DexPathList[[zip file "/data/app/tv.danmaku.ijk.media.example-1/base.apk"],nativeLibraryDirectories=[/data/app/tv.danmaku.ijk.media.example-1/lib/arm64, /system/lib64, /vendor/lib64]]] couldn't find "libijkffmpeg.so"
     *         at java.lang.Runtime.loadLibrary0(Runtime.java:984)
     *         at java.lang.System.loadLibrary(System.java:1530)
     *         at tv.danmaku.ijk.media.player.IjkMediaPlayer$1.loadLibrary(IjkMediaPlayer.java:179)
     *         at tv.danmaku.ijk.media.player.IjkMediaPlayer.loadLibrariesOnce(IjkMediaPlayer.java:190)
     *         at tv.danmaku.ijk.media.example.activities.VideoActivity.onCreate(VideoActivity.java:137)
     *         at android.app.Activity.performCreate(Activity.java:6861)
     *         at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1119)
     *         at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2693)
     *         at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2801)
     *         at android.app.ActivityThread.-wrap12(ActivityThread.java)
     *         at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1548)
     *         at android.os.Handler.dispatchMessage(Handler.java:102)
     *         at android.os.Looper.loop(Looper.java:163)
     *         at android.app.ActivityThread.main(ActivityThread.java:6365)
     *         at java.lang.reflect.Method.invoke(Native Method)
     *         at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:901)
     *         at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:791)
     *
     * ================
     * "No toolchains found in the NDK toolchains folder for ABI with prefix: mips64el-linux-android"
     * 这个是因为ndk-17中移除了 mips64el-linux-android 和mipsel-linux-android
     * Note: Historically the NDK supported 32-bit and 64-bit MIPS, but support was removed in NDK r17.
     *
     * 所以我们去 https://developer.android.google.cn/ndk/downloads/older_releases?hl=zh-cn
     * 这里下载，然后把 {sdk}/ndk-bundle/toolchains下的mipsel-linux-android文件夹赋值到对应的位置即可
     *
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
