package com.freeds.tool;

import android.util.Log;

/**
 *
 * @author Freeds
 * @date 2018/11/5
 */

public class LogUtils {

    private static boolean LOGING = false;

    private static String TAG = "TAG";


    public static void setTag(String tag){
        TAG = tag;
    }
    public static void openLoging(){
        LOGING = true;
    }



    public static void v(String tag, String msg) {
        if (LOGING) {
            Log.v(tag, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (LOGING) {
            Log.d(tag, msg);
        }
    }


    public static void i(String tag, String msg) {
        if (LOGING) {
            Log.i(tag, msg);
        }
    }


    public static void w(String tag, String msg) {
        if (LOGING) {
            Log.w(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (LOGING) {
            Log.e(tag, msg);
        }
    }



    public static void v(String msg) {
        if (LOGING) {
            Log.v(TAG, msg);
        }
    }

    public static void d(String msg) {
        if (LOGING) {
            Log.d(TAG, msg);
        }
    }

    public static void i(String msg) {
        if (LOGING) {
            Log.i(TAG, msg);
        }
    }

    public static void w(String msg) {
        if (LOGING) {
            Log.w(TAG, msg);
        }
    }

    public static void e(String msg) {
        if (LOGING) {
            Log.e(TAG, msg);
        }
    }
}
