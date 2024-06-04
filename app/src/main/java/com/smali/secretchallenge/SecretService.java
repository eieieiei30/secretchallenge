package com.smali.secretchallenge;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class SecretService extends Service {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("SecretService", "Service created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("SecretService", "Service started");
        // 在这里执行后台任务
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("SecretService", "Service destroyed");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // 返回null表示该服务不是绑定服务
        return null;
    }
}
