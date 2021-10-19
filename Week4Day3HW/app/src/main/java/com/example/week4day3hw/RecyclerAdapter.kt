package com.example.week4day3hw

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(val towers: List<Towers>): RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item_layout_view = LayoutInflater.from(parent.context).inflate(

            R.layout.item_layout,
            parent,
            false
        )
        Log.d("TowersAdapter", "onCreateViewHolder()Called")
        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("TowersAdapter", "onCreateViewHolder()Called Position: $position")

        holder.efil.text = towers[position].text
        holder.img.setImageResource(towers[position].img)

    }

    override fun getItemCount(): Int {
        return towers.size
    }
}

class ViewHolder(item_layout: View) : RecyclerView.ViewHolder(item_layout) {

    val efil: TextView = item_layout.findViewById(R.id.effil_text)
    val img: ImageView = item_layout.findViewById(R.id.effil_tower)

}

