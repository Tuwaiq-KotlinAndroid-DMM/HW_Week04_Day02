package com.example.homework

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class CardAdapter(var list :List<CradViewData>) :RecyclerView.Adapter<viewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)


        return viewHolder(view)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        val item = list[position]
        holder.textCard.text = item.pragraph
        holder.imageCard.setImageResource(item.image)
    }

    override fun getItemCount(): Int = list.size


}


class viewHolder (view: View): RecyclerView.ViewHolder(view){
    var textCard :TextView = view.findViewById(R.id.text_card)
    var imageCard :ImageView = view.findViewById(R.id.image_card)
}