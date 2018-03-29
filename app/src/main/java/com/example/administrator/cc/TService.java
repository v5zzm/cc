package com.example.administrator.cc;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by Administrator on 2018/3/13.
 */

public class TService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Notification notification = new Notification(R.drawable.ic_launcher_background,
                getString(R.string.app_name), System.currentTimeMillis());

        PendingIntent pendingintent = PendingIntent.getActivity(this, 0,
                new Intent(this, TService.class), 0);
        startForeground(0x111, notification);

        return START_STICKY;
    }
}
