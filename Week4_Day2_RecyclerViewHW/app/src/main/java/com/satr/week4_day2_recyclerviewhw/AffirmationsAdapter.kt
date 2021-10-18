package com.satr.week4_day2_recyclerviewhw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class AffirmationsAdapter(val list: List<AffirmationsDataModel>): RecyclerView.Adapter<AffirmationsAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val affirmationsText: TextView = view.findViewById(R.id.affirmations_text)
        val img: ImageView = view.findViewById(R.id.img)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayoutView = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout,
            parent,
            false
        )

        return ViewHolder(itemLayoutView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.affirmationsText.text = list[position].affirmation
        holder.img.setImageResource(list[position].img)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}