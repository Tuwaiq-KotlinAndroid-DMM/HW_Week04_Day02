package com.example.affirmationapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdaptor(val cardContent:List<CardContent>):RecyclerView.Adapter<RecyclerAdaptor.ViewHolder> (){
    class ViewHolder(items_layout: View):RecyclerView.ViewHolder(items_layout){
        val affirTextView:TextView=items_layout.findViewById(R.id.affirmative_text)
        val imageView:ImageView=items_layout.findViewById(R.id.image_View)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val inflater=LayoutInflater.from(parent.context).inflate(R.layout.items_layout,parent,false)
        return ViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.affirTextView.text=cardContent[position].affir_text
        holder.imageView.setImageResource(cardContent[position].img)
    }

    override fun getItemCount(): Int {
       return cardContent.size
    }
}