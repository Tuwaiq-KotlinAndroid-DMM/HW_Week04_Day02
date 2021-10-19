package com.kotlin.homeworkweek4day2


import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



//creating Adapter

class ExpressionAdapter(val expression: List<ExpressionPhotos>): RecyclerView.Adapter<ExpressionPhotosViewHolder>(){
    // the hall function connect layout with the adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExpressionPhotosViewHolder {
        val item_layout_view = LayoutInflater.from(parent.context).inflate(
            R.layout.item_layout,
            parent,
            false
        )
        Log.d("Expression Adapter","onCreateViewHolder() Called")
        return ExpressionPhotosViewHolder(item_layout_view)
    }
    //تحفظ الData اللي ناخذها من ال List
    override fun onBindViewHolder(holder: ExpressionPhotosViewHolder, position: Int) {

        Log.d("Expression Adapter","onCreateViewHolder() Called Position : $position")

        holder.text.text = expression[position].expresstext
        holder.image.setImageResource(expression[position].expressimage)
    }

    override fun getItemCount(): Int {
        return expression.size
    }

}

// this is view holder to help Adapter to work

class ExpressionPhotosViewHolder(item_layout:View): RecyclerView.ViewHolder(item_layout){
    val text: TextView = item_layout.findViewById(R.id.text_expresion)
    val image: ImageView = item_layout.findViewById(R.id.mood_image)
}