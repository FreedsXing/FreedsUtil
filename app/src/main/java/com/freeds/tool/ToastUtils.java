package com.freeds.tool;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * Created by Freeds on 2021/6/21 0021.
 */
public class ToastUtils {


    private static Context mContext;

    public static void setToastContext(Context context){
        mContext = context;
    }

    private static Toast toast;

    /**
     * Toast提示
     * @param msg 提示消息
     */
    public static void toastMessage(String msg) {
        if (TextUtils.isEmpty(msg)  || "null".equals(msg) || msg.contains("null")) {
            return;
        }
        int duration;
        if (msg.length() > 15) {
            duration = Toast.LENGTH_LONG;
        } else {
            duration = Toast.LENGTH_SHORT;
        }
        if (toast == null) {
            toast = Toast.makeText(mContext, msg, duration);
        } else {
            toast.setDuration(duration);
            toast.setText(msg);
        }

        toast.show();
    }
}
