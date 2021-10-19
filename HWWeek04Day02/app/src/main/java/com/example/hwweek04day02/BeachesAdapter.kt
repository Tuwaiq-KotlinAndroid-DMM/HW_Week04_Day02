package com.example.hwweek04day02

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BeachesAdapter(val beaches:List<BeachesDataModel>) :RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
val item_layout_view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        Log.d("BeachesAdapter", "onCreateViewHolder")

        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("BeachesAdapter", "onBindViewHolder position: $position")

        holder.textView.text = beaches[position].textView
        holder.img.setImageResource(beaches[position].imageView)
    }

    override fun getItemCount(): Int {
     return beaches.size   }

}

class ViewHolder(item_layout: View) : RecyclerView.ViewHolder(item_layout){
    val textView: TextView = item_layout.findViewById(R.id.textview)
    val img: ImageView = item_layout.findViewById(R.id.imageview)
}