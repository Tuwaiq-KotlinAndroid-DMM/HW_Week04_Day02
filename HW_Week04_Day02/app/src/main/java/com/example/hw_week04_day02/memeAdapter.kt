package com.example.hw_week04_day02

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
    val comment : TextView = view.findViewById(R.id.title)
    val img : ImageView = view.findViewById(R.id.memeimage)
}

class memeAdapter(val memes: List<memeDataClass>) : RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item_layout_view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout,
            parent,
            false
        )
        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.comment.text = memes[position].comment
        holder.img.setImageResource(memes[position].img)
    }

    override fun getItemCount(): Int {
        return memes.size
    }


}