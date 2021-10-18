package com.example.solution

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class imageAdapter(var image_list:List<ImageData>): RecyclerView.Adapter<ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val itm_layout_view  = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
            return ViewHolder(itm_layout_view)
        }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text_under_img.text = image_list[position].theText
        holder.img.setImageResource(image_list[position].image_card)
    }

    override fun getItemCount(): Int {
        return image_list.size
    }


}
class ViewHolder(view: View):RecyclerView.ViewHolder(view){

    var text_under_img: TextView = view.findViewById(R.id.the_descrip_view)
    var img: ImageView = view.findViewById(R.id.imageView)

}