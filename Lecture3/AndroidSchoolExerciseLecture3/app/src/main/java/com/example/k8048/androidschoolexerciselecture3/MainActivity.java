package com.example.k8048.androidschoolexerciselecture3;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int notification_ID = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchAction(View view){
        //create impl intent
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.jamk.fi"));

        //create pending intent
        PendingIntent actionPendingIntent = PendingIntent.getActivity(this, 0, intent, 0);

        //create notification
        Notification notif = new Notification.Builder(this)
                .setCategory(Notification.CATEGORY_MESSAGE)
                .setContentTitle("JAMK notification")
                .setContentText("This is first notification. I don't know, what to do with that.")
                .setSmallIcon(R.drawable.ic_bug)
                .setAutoCancel(true)
                .setContentIntent(actionPendingIntent)
                .setVisibility(Notification.VISIBILITY_PUBLIC)
                .build();

        //connect notification manager
        NotificationManager notifManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

        //make notification
        notifManager.notify(notification_ID, notif);
    }
}
