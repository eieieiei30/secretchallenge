package com.smali.secretchallenge;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class SecretBootReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){
            Log.d("SecretBootReceiver", "Boot complete detected, starting service...");
            Intent serviceIntent = new Intent(context, SecretService.class);
            context.startService(serviceIntent);
        }
    }
}
