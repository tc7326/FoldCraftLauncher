package com.tungsten.fclauncher.utils;

import android.content.Context;
import android.os.Environment;

import java.io.File;

public class FCLPath {

    public static Context CONTEXT;

    public static String NATIVE_LIB_DIR;

    public static String LOG_DIR;
    public static String CACHE_DIR;

    public static String RUNTIME_DIR;
    public static String JAVA_8_PATH;
    public static String JAVA_11_PATH;
    public static String JAVA_17_PATH;
    public static String JAVA_21_PATH;
    public static String LWJGL_DIR;
    public static String CACIOCAVALLO_8_DIR;
    public static String CACIOCAVALLO_11_DIR;
    public static String CACIOCAVALLO_17_DIR;

    public static String FILES_DIR;
    public static String PLUGIN_DIR;
    public static String BACKGROUND_DIR;
    public static String CONTROLLER_DIR;

    public static String PRIVATE_COMMON_DIR;
    public static String SHARED_COMMON_DIR;

    public static String AUTHLIB_INJECTOR_PATH;
    public static String MULTIPLAYER_FIX_PATH;
    public static String LT_BACKGROUND_PATH;
    public static String DK_BACKGROUND_PATH;

    public static void loadPaths(Context context) {
        CONTEXT = context;

        //这里写到根路径了 肯定是不可以的
        SHARED_COMMON_DIR = context.getDataDir().getAbsolutePath() + "/FCL/.minecraft";

        NATIVE_LIB_DIR = context.getApplicationInfo().nativeLibraryDir;

        //这里写到根路径了 肯定是不可以的
//        LOG_DIR = Environment.getExternalStorageDirectory().getAbsolutePath() + "/FCL/log";
        LOG_DIR = context.getDataDir().getAbsolutePath() + "/FCL/log";
        CACHE_DIR = context.getCacheDir() + "/fclauncher";

        RUNTIME_DIR = context.getDir("runtime", 0).getAbsolutePath();
        JAVA_8_PATH = RUNTIME_DIR + "/java/jre8";
        JAVA_11_PATH = RUNTIME_DIR + "/java/jre11";
        JAVA_17_PATH = RUNTIME_DIR + "/java/jre17";
        JAVA_21_PATH = RUNTIME_DIR + "/java/jre21";
        LWJGL_DIR = RUNTIME_DIR + "/lwjgl";
        CACIOCAVALLO_8_DIR = RUNTIME_DIR + "/caciocavallo";
        CACIOCAVALLO_11_DIR = RUNTIME_DIR + "/caciocavallo11";
        CACIOCAVALLO_17_DIR = RUNTIME_DIR + "/caciocavallo17";

        FILES_DIR = context.getFilesDir().getAbsolutePath();
        PLUGIN_DIR = FILES_DIR + "/plugins";
        BACKGROUND_DIR = FILES_DIR + "/background";

        //这里写到根路径了 肯定是不可以的
//        CONTROLLER_DIR = Environment.getExternalStorageDirectory().getAbsolutePath() + "/FCL/control";
        CONTROLLER_DIR = context.getDataDir().getAbsolutePath() + "/FCL/control";

//        PRIVATE_COMMON_DIR = context.getExternalFilesDir(".minecraft").getAbsolutePath();
        PRIVATE_COMMON_DIR = context.getDataDir().getAbsolutePath()+"/.minecraft";

        AUTHLIB_INJECTOR_PATH = PLUGIN_DIR + "/authlib-injector.jar";
        MULTIPLAYER_FIX_PATH = PLUGIN_DIR + "/MultiplayerFix.jar";
        LT_BACKGROUND_PATH = BACKGROUND_DIR + "/lt.png";
        DK_BACKGROUND_PATH = BACKGROUND_DIR + "/dk.png";

        init(LOG_DIR);
        init(CACHE_DIR);
        init(RUNTIME_DIR);
        init(JAVA_8_PATH);
        init(JAVA_11_PATH);
        init(JAVA_17_PATH);
        init(JAVA_21_PATH);
        init(LWJGL_DIR);
        init(CACIOCAVALLO_8_DIR);
        init(CACIOCAVALLO_11_DIR);
        init(CACIOCAVALLO_17_DIR);
        init(FILES_DIR);
        init(PLUGIN_DIR);
        init(BACKGROUND_DIR);
        init(CONTROLLER_DIR);
        init(PRIVATE_COMMON_DIR);
        init(SHARED_COMMON_DIR);
    }

    private static boolean init(String path) {
        if (!new File(path).exists()) {
            return new File(path).mkdirs();
        }
        return true;
    }

}
