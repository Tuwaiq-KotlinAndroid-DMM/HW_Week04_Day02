package com.example.my_soulotion_w4d2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val list: List<InformClass>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)


        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
holder.text.text = list[position].textView
    holder.img.setImageResource(list[position].img)}

    override fun getItemCount(): Int {
return list.size
    }


}

class ViewHolder(item_layout: View) : RecyclerView.ViewHolder(item_layout) {
    val text: TextView = item_layout.findViewById(R.id.textView)
    val img: ImageView = item_layout.findViewById(R.id.imageView)
}