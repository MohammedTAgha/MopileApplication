package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.mohetabsem.mopileapplication.R
import kotlinx.android.synthetic.main.item.view.*

class Adapter(context: Context,
                    private val names: Array<String>,
                    private val images: Array<Int>) :
    ArrayAdapter<Int>(context, R.layout.item, images) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val l:LayoutInflater = LayoutInflater.from(context)
        val customView = l.inflate(R.layout.item, parent, false)
//        customView.textView.text = names[position]
//        customView.imageView.setImageResource(images[position])

        return customView
    }
}