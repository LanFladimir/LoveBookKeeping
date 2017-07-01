package com.fladimir.loversbookkeeping.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v7.app.NotificationCompat;

/**
 * Created by NingJiang on 2017/6/18 0018.
 * Class Note:通知工具类
 */

public class NotificationUtil {
    private static NotificationManager mManager = null;

    public NotificationUtil() {
    }

    public class Builder {
        Context mContext;
        NotificationCompat.Builder mNotification;

        public Builder(Context context) {
            mContext = context;
            mManager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);
            mNotification = new NotificationCompat.Builder(context);
        }

        public Builder ticker(String ticker) {
            mNotification.tickerText = ticker;
            return this;
        }

        public Builder when() {
            mNotification.when = System.currentTimeMillis();
            return this;
        }
        //icon
        //flags
        //contentIntent

        public void show(){
            //mNotification.show();
        }
    }
}
