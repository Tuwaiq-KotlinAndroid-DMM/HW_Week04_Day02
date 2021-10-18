package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val list: MutableList<Cards>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var inflater =
            LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(list.get(position).image)
        holder.textView.text = list.get(position).text
    }

    override fun getItemCount(): Int {
        return list.size
    }

}

class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var textView: TextView = view.findViewById(R.id.text_view)
    var imageView: ImageView = view.findViewById(R.id.image_view)


}