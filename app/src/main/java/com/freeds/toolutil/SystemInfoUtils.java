package com.freeds.toolutil;

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

    /**
     * 获取手机型号
     *
     * @return 手机型号  MI 6
     */
    public static String getSystemModel() {
        return Build.MODEL;
    }


    /**
     * 获取设备品牌
     *
     * @return 设备品牌
     */
    public static String getDeviceBrand() {
        return Build.BRAND;
    }

    /**
     * 获取设备厂商名
     * @return 厂商名
     */
    public static String getDeviceManufacturer(){
        return Build.MANUFACTURER;
    }

}
