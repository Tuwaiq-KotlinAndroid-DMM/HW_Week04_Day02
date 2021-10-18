package com.example.hw1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PicAdapter(val cards: List<PicDataModel>): RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item_layout_view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout,
            parent,
            false
        )
        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = cards[position].textView
        holder.img.setImageResource(cards[position].imageView)
    }

    override fun getItemCount(): Int {
        return cards.size
    }
}

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.text_view)
        val img: ImageView = view.findViewById(R.id.image_view)
    }

