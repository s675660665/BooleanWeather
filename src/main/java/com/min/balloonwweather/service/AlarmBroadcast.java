package com.min.balloonwweather.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2015/12/18.
 */
public class AlarmBroadcast extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i=new Intent(context,AutoUpdateService.class);
        context.startService(i);
    }
}
