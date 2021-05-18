package com.mohetabsem.mopileapplication

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_multi_media.*

class MultiMedia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multi_media)

        var mediaPlayer: MediaPlayer=MediaPlayer()

        playBtn.setOnClickListener {
            if (mediaPlayer == null) {
                mediaPlayer = MediaPlayer.create(this, R.raw.music)
                //mediaPlayer = MediaPlayer.create(this, Uri.parse("http://commondatastorage.googleapis.com/codeskulptor-assets/sounddogs/thrust.mp3"))
                mediaPlayer!!.isLooping = true
                mediaPlayer!!.start()
            } else mediaPlayer!!.start()
        }

        pauseBtn.setOnClickListener {
            if (mediaPlayer != null && mediaPlayer!!.isPlaying){
                mediaPlayer!!.pause()
            }
        }

        stopBtn.setOnClickListener {
            if (mediaPlayer != null) {
                mediaPlayer!!.stop()
                mediaPlayer!!.release()

            }
        }
        play.setOnClickListener{
            if (play.text=="start"){
                mediaPlayer?.reset()
                mediaPlayer = MediaPlayer.create(this, R.raw.music)
                mediaPlayer.start()
                play.text="stop"
            }else if (play.text=="stop"){
                mediaPlayer.stop()
                play.text="start"
            }
        }
    }
}