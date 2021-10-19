package com.example.cardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter(val card:List<CardDataModel>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item_layout_view= LayoutInflater.from(parent.context).inflate(R.layout.cardlayout,parent,false)

        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.quote.text= card[position].quote
        holder.card.setImageResource(card[position].card)
    }

    override fun getItemCount(): Int {
        return card.size
    }
}



class ViewHolder(val view: View):RecyclerView.ViewHolder(view)
{
    var  quote: TextView =view.findViewById(R.id.quote)
    var card: ImageView =view.findViewById(R.id.card)


}
