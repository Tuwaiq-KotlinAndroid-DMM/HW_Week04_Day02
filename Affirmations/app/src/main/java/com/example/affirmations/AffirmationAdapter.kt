package com.example.affirmations

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class AffirmationAdapter(val cards: List<AffirmationDataModel>):RecyclerView.Adapter<AffirmationAdapter.ViewHolder>() {


    class  ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        //val basic_card: CardView =view.findViewById(R.id.CardView)
        val card_img: ImageView =view.findViewById(R.id.card_Img)
        val card_txt: TextView = view.findViewById(R.id.card_txt)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        //holder.basic_card = cards[position].natureCard
        holder.card_img.setImageResource(cards[position].natureImg)
        holder.card_txt.text = cards[position].natureTxt



    }

    override fun getItemCount(): Int {
        return 4
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val item_Layout_view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout,parent,false)
        return ViewHolder(item_Layout_view)
    }
}