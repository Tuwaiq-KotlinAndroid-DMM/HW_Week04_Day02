package com.example.homeworkweek4day2

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter (val cards: List<ImageDataModel>):
    RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item_layout_view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout, parent, false
        )
        Log.d("ImageeAdapter"," onCreateViewHolder() Called")
        return ViewHolder(item_layout_view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("EmpolyeeAdapter"," onCreateViewHolder() Called Position: $position")
        holder.cardName.text = cards[position].cardName
        holder.img.setImageResource(cards[position].img)
    }

    override fun getItemCount(): Int {
        return cards.size

    }

}
class ViewHolder(view: View): RecyclerView.ViewHolder(view){
    val cardName: TextView = view. findViewById(R.id.textView)
    val img : ImageView = view.findViewById(R.id.imageView3)
}