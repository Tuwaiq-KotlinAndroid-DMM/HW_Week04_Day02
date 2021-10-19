package com.example.hww4d2

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class CardsAdapter(val Cards: List<CardsModel>): RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item_layout = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(item_layout)
    }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.fullName.text = Cards[position].fullName
            holder.img.setImageResource(Cards[position].img)

        }
            override fun getItemCount(): Int {
                return Cards.size
            }
}
        class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
            val fullName: TextView = view.findViewById(R.id.fullname)
            val img: ImageView = view.findViewById(R.id.emp_img)
            val card1: CardView = view.findViewById(R.id.emp_card)
        }
