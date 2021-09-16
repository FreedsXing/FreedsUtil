package com.freeds.tool.util;

import android.content.Context;

import com.zfxf.base.BaseApplication;
import com.zfxf.base.Constants;
import com.zfxf.base.R;

/**
 * Created by Freeds on 2021/6/1 0001.
 */
public class UnitTurnUtil {


    /**
     * 根据手机分辨率 px 转成 sp
     */
    public static int px2sp(Context context, float pxValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (pxValue / fontScale + 0.5f);
    }


    /**
     * 根据手机的分辨率从 dip 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(Context context, float pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}


