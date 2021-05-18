package com.mohetabsem.mopileapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fragmarnts.*

class Fragmarnts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragmarnts)

        first.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, First())
                .commit()
        }

        second.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment, Second())
                .commit()
        }

    }
}