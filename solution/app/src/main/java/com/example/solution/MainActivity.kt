package com.example.solution

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val theImage_ = mutableListOf(
        ImageData("Have hope",R.drawable.img_2),
        ImageData("Beautiful view", R.drawable.img_1),
        ImageData("wonderful nature",R.drawable.img)

        )

    private lateinit var empRecyclerView: RecyclerView
    private lateinit var empAapter:imageAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        empRecyclerView = findViewById(R.id.Item_view_pic)
        empAapter = imageAdapter(theImage_)
        empRecyclerView.adapter = empAapter



    }
}