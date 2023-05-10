package com.freeds.tool;

import android.content.Context;
import android.content.SharedPreferences;

public class SpTools {

    private static Context mContext;

    public static void setSpContext(Context context){
        mContext = context;
    }

    private static String mFileName;
    public static void setFileName(String fileName){
        mFileName = fileName;
    }


    public static void setString(String key, String value) {
        SharedPreferences sp = mContext.getSharedPreferences(mFileName, Context.MODE_PRIVATE);
        sp.edit().putString(key, value).commit();
    }

    public static String getString(String key, String value) {
        SharedPreferences sp = mContext.getSharedPreferences(mFileName, Context.MODE_PRIVATE);
        return sp.getString(key, value);
    }



    public static void setBoolean(String key, boolean value) {
        SharedPreferences sp = mContext.getSharedPreferences(mFileName, Context.MODE_PRIVATE);
        sp.edit().putBoolean(key, value).commit();
    }

    public static boolean getBoolean(String key, boolean value) {
        SharedPreferences sp = mContext.getSharedPreferences(mFileName, Context.MODE_PRIVATE);
        return sp.getBoolean(key, value);
    }



    public static void setInt(String key, int value) {
        SharedPreferences sp = mContext.getSharedPreferences(mFileName, Context.MODE_PRIVATE);
        sp.edit().putInt(key, value).commit();
    }

    public static int getInt(String key, int value) {
        SharedPreferences sp = mContext.getSharedPreferences(mFileName, Context.MODE_PRIVATE);
        return sp.getInt(key, value);
    }


    public static void setLong(String key, Long value) {
        SharedPreferences sp = mContext.getSharedPreferences(mFileName, Context.MODE_PRIVATE);
        sp.edit().putLong(key, value).commit();
    }

    public static Long getLong(String key, Long value) {
        SharedPreferences sp = mContext.getSharedPreferences(mFileName, Context.MODE_PRIVATE);
        return sp.getLong(key, value);
    }
}
