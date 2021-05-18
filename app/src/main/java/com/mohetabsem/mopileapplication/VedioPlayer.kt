package com.mohetabsem.mopileapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_vedio_player.*

class VedioPlayer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vedio_player)


//        videoView.setVideoURI(Uri.parse("http://techslides.com/demos/sample-videos/small.mp4"))
        videoView.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.vedio   ))
        val mediaController= MediaController(this)
        videoView.setMediaController(mediaController)
        videoView.start()
    }
}