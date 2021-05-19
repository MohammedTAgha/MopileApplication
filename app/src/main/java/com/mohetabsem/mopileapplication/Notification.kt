package com.mohetabsem.mopileapplication

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import kotlinx.android.synthetic.main.activity_notification.*

class Notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        val id = 1
        val ChannelId = "cId_1"

        notification.setOnClickListener { 
            val importance=NotificationManager.IMPORTANCE_HIGH
            val mChannel=NotificationChannel("cId_1","name",importance)
            val notification=NotificationCompat.Builder(this,ChannelId)
                .setSmallIcon(R.drawable.ic_baseline_notifications_none_24)
                .setContentTitle("APPLICATION")
                .setContentText("THERE IS A NEW NOTIFICATION")

                .build()
            val mNotificationManager=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            mNotificationManager.createNotificationChannel(mChannel)
            mNotificationManager.notify(id,notification)

        }

    }
}