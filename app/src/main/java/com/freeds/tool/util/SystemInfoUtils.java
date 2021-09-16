package com.freeds.tool.util;

import android.os.Build;

/**
 * Created by Freeds on 2021/6/21 0021.
 */
public class SystemInfoUtils {

    /**
     * 获取当前手机系统版本号
     *
     * @return 系统版本号  9
     */
    public static String getSystemVersion() {
        return Build.VERSION.RELEASE;
    }
}
