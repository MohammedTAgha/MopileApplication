package com.mohetabsem.mopileapplication

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_dialog.*
import kotlinx.android.synthetic.main.alert_item.view.*

class Dialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog)

        shawDialog.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Title")
            builder.setMessage("message")
            builder.setPositiveButton("ok"){_: DialogInterface , Int ->
                Toast.makeText(this,"ok",Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("no"){_: DialogInterface , Int ->
                Toast.makeText(this,"ok",Toast.LENGTH_SHORT).show()

            }
            builder.setNeutralButton("cansle"){_: DialogInterface , Int ->
                Toast.makeText(this,"ok",Toast.LENGTH_SHORT).show()
            }
            val dialog=builder.create()
           dialog.show()
        }

        var dialogInflater=LayoutInflater.from(this).inflate(R.layout.alert_item,null)
        shawDialog2.setOnClickListener {
            val builder=AlertDialog.Builder(this)
            builder.setView(dialogInflater)
            val dialog=builder.create()
            dialog.show()
            dialogInflater.cansle.setOnClickListener {
                dialog.dismiss()
            }
        }

    }
}