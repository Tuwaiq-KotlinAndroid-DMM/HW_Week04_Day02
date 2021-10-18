package com.example.recyclerhomework

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapterh(val materialCardView:List<Card>): RecyclerView.Adapter<ViewHolder>()   {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val item_layout_view = LayoutInflater.from(parent.context).inflate(
            R.layout.recyclerview_model,
            parent,
            false)
        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.details.text = materialCardView[position].details
        holder.img.setImageResource(materialCardView[position].img)
    }
    override fun getItemCount(): Int {
        return materialCardView.size
    }
}
class ViewHolder(view: View):RecyclerView.ViewHolder(view){
    val details: TextView = view.findViewById(R.id.textView)
    val img: ImageView = view.findViewById(R.id.item_image)
}