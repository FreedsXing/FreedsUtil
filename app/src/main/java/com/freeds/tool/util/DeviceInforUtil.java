package com.freeds.tool.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by Freeds on 2021/6/21 0021.
 */
public class DeviceInforUtil {

    public static final String WIFI_STRING = "wifi";



    /**
     * 获取手机型号
     *
     * @return 手机型号  MI 6
     */
    public static String getDeviceModel() {
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


    /**
     * 获取 mac 地址
     * @return
     */
    @SuppressLint({"NewApi", "MissingPermission"})
    public static String getMac(Context context) {

        try {
            if (Build.VERSION.SDK_INT >= 23) {
                String str = getMacMoreThanM();
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
            // 6.0以下手机直接获取wifi的mac地址即可
            @SuppressLint("WrongConstant") WifiManager wifiManager = (WifiManager) context.getSystemService(WIFI_STRING);
            WifiInfo wifiInfo = wifiManager.getConnectionInfo();
            if (wifiInfo != null) {
                return wifiInfo.getMacAddress();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }

    private static String getMacMoreThanM() {
        try {
            //获取本机器所有的网络接口
            Enumeration enumeration = NetworkInterface.getNetworkInterfaces();
            while (enumeration.hasMoreElements()) {
                NetworkInterface networkInterface = (NetworkInterface) enumeration.nextElement();
                //获取硬件地址，一般是MAC
                byte[] arrayOfByte = networkInterface.getHardwareAddress();
                if (arrayOfByte == null || arrayOfByte.length == 0) {
                    continue;
                }

                StringBuilder stringBuilder = new StringBuilder();
                for (byte b : arrayOfByte) {
                    //格式化为：两位十六进制加冒号的格式，若是不足两位，补0
                    stringBuilder.append(String.format("%02X:", new Object[]{Byte.valueOf(b)}));
                }
                if (stringBuilder.length() > 0) {
                    //删除后面多余的冒号
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
                String str = stringBuilder.toString();
                // wlan0:无线网卡 eth0：以太网卡
                if (networkInterface.getName().equals("wlan0")) {
                    return str;
                }
            }
        } catch (SocketException socketException) {
            return null;
        }
        return null;
    }
}
