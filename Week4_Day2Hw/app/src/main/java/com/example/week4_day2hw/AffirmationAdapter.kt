package com.example.week4_day2hw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AffirmationAdapter(var affirmationList: List <AffirmationDataClass> ):
    RecyclerView.Adapter <AffirmationAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val affir_text_view: TextView = view.findViewById(R.id.affir_text_view)
        val affir_img_view: ImageView = view.findViewById(R.id.affir_img_view)}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val card_View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout,parent,false)

        return ViewHolder(card_View)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.affir_text_view.text = affirmationList[position].affirmation_text_view
        holder.affir_img_view.setImageResource(affirmationList[position].affirmation_img_view)
    }

    override fun getItemCount(): Int {
        return affirmationList.size
    }
}

