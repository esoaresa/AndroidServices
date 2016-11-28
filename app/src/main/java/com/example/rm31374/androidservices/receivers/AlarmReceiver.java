package com.example.rm31374.androidservices.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

import com.example.rm31374.androidservices.R;

/**
 * Created by rm31374 on 28/11/2016.
 */
public class AlarmReceiver extends BroadcastReceiver {
    private MediaPlayer mp = null;

    public AlarmReceiver() {

    }

    public void onReceive(Context context, Intent intent) {
        mp = MediaPlayer.create(context, R.raw.hadouken);
        mp.start();
        Toast.makeText(context, "Alarm....", Toast.LENGTH_LONG).show();
    }
}
