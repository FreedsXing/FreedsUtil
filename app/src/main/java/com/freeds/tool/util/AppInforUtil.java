package com.freeds.tool.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.zfxf.base.BaseApplication;

/**
 * Created by Freeds on 2021/6/21 0021.
 */
public class AppInforUtil {

    /**
     * 获取应用版本名: 8.5.9
     */
    public static String getAppVersionName(Context context) {
        return getPackageInfo(context).versionName;
    }

    /**
     * 获取应用版本号 859
     */
    public static int getAppVersionCode(Context context) {
        return getPackageInfo(context).versionCode;
    }

    /**
     * 得到应用程序的包名
     */
    public static String getPackageName(Context context) {
        return getPackageInfo(context).packageName;
    }

    /**
     * 获取应用包名
     * @param context  context
     * @return packageInfo
     */
    private static PackageInfo getPackageInfo(Context context) {
        PackageInfo packageInfo = null;
        try {
            PackageManager pm = context.getPackageManager();
            packageInfo = pm.getPackageInfo(context.getPackageName(), PackageManager.GET_CONFIGURATIONS);

            return packageInfo;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return packageInfo;
    }

}
