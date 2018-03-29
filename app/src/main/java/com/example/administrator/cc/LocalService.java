package com.example.administrator.cc;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

import java.util.Random;

/**
 * Created by Administrator on 2018/3/28.
 */

public class LocalService extends Service {


    private final Random random=new Random();
    private final LocalBinder binder=new LocalBinder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public class LocalBinder extends Binder{
        public LocalService getLocalService(){
            return LocalService.this;
        }
    }


    public int getRundomNumber(){
        return random.nextInt(100);
    }
}
