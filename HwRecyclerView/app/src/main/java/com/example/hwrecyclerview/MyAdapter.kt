package com.example.hwrecyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter (val me : List<MydataModel>):RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val item_layout_view = LayoutInflater.from(parent.context).inflate(
           R.layout.item_layout,
           parent,
           false
       )
        Log.d("MyAdapter", "onCreateViewHolder()called")
        return ViewHolder(item_layout_view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.d("MyAdapter", "onCreateViewHolder()called Position $position" )

        holder.thoUght.text = me[position].thoughts
        holder.img1.setImageResource(me[position].img)
//        holder.thoUght.text= me [position].thoughts
//        holder.img1.setImageResource(me[position].img)

    }

    override fun getItemCount(): Int {
        return me.size
    }

}
class ViewHolder(item_layout: View) : RecyclerView.ViewHolder(item_layout) {
    var thoUght : TextView = item_layout.findViewById(R.id.thoughts)
    var img1 : ImageView = item_layout.findViewById(R.id.img)


}