package com.example.affirmations

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AffirmationsAdapter(val list : List<AffirmationsData>)
    :RecyclerView.Adapter<AffirmationsAdapter.AffirmationsHolder>() {


    class AffirmationsHolder(itemLayout: View) :RecyclerView.ViewHolder(itemLayout){
        val textView : TextView = itemLayout.findViewById(R.id.text_view)
        val imag : ImageView = itemLayout.findViewById(R.id.imag_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AffirmationsHolder {
        val item_layout = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout,
            parent, false)
        return AffirmationsHolder(item_layout)
    }

    override fun onBindViewHolder(holder: AffirmationsHolder, position: Int) {
        holder.imag.setImageResource(list[position].imag)
        holder.textView.text = list[position].textView
    }

    override fun getItemCount(): Int {
       return list.size
    }
}