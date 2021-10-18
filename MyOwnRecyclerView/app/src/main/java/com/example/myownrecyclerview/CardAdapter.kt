package com.example.myownrecyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(val cardView: List<CardDataModel>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item_layout_view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout,
            parent,
            false
        )
        Log.d("CardAdapter","onCreateViewHolder() Called")
        return ViewHolder(item_layout_view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("CardAdapter","onBindViewHolder() Called position $position")

        holder.proudText.text = cardView[position].proudText
        holder.img.setImageResource(cardView[position].img)

    }

    override fun getItemCount(): Int {
       return  cardView.size
    }


}


class ViewHolder(item_layout: View): RecyclerView.ViewHolder(item_layout){

    val proudText: TextView = item_layout.findViewById(R.id.info_text)
    val img: ImageView =item_layout.findViewById(R.id.card_img)
}