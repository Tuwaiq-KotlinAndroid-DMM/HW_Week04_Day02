package com.example.affirmationapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AffirmationAdapter(val affirmationList: List<AffirmationDataModel>):
    RecyclerView.Adapter<AffirmationAdapter.AffirmationViewHolder>() {

    class AffirmationViewHolder(view: View): RecyclerView.ViewHolder(view){

        val affir_image: ImageView = view.findViewById(R.id.affir_imageView)
        val affir_textView: TextView = view.findViewById(R.id.affir_textView)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AffirmationViewHolder {
       val item_layout_view = LayoutInflater.from(parent.context)
           .inflate(R.layout.item_layout,parent,false)

        return AffirmationViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: AffirmationViewHolder, position: Int) {

        holder.affir_textView.text = affirmationList[position].affir_textView
        holder.affir_image.setImageResource(affirmationList[position].affir_image)
    }

    override fun getItemCount(): Int {
     return  affirmationList.size
    }
}