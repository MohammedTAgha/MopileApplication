package com.mohetabsem.mopileapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        a1.setOnClickListener {
            var intent1=Intent(this,WebView::class.java)
            startActivity(intent1)
        }
        a2.setOnClickListener {
            var intent2=Intent(this,MultiMedia::class.java)
            startActivity(intent2)
        }
        a3.setOnClickListener {
            var intent2=Intent(this,VedioPlayer::class.java)
            startActivity(intent2)
        }
        a4.setOnClickListener {
            var intent2=Intent(this,Fragmarnts::class.java)
            startActivity(intent2)
        }
        a5.setOnClickListener {
            var intent2=Intent(this, Dialog::class.java)
            startActivity(intent2)
        }
    }
}