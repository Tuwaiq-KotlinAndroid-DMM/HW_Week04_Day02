package com.example.week4day3hw

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class RecyclerAdapter(val towers: List<Towers>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val item_layout_view = LayoutInflater.from(parent.context).inflate(

           R.layout.item_layout,
           parent,
           false
       )
        Log.d("TowersAdapter","onCreateViewHolder()Called")
        return RecyclerView.ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        Log.d("TowersAdapter","onCreateViewHolder()Called Position: $position")

        holder.efil
    }

    override fun getItemCount(): Int {
        return towers.size
}

class ViewHolder(item_layout: View) : RecyclerView.ViewHolder(item_layout) {

    val efil: TextView = item_layout.findViewById(R.id.effil_text)
    val img: ImageView = item_layout.findViewById(R.id.effil_tower)

}

