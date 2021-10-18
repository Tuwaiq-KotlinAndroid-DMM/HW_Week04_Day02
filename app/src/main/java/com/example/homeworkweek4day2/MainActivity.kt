package com.example.homeworkweek4day2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val imagee = mutableListOf(
        ImageDataModel(
            " Believe in yourself",
            R.drawable.img
        ),
        ImageDataModel(
            "Work Hard",
            R.drawable.img_1
        ),
        ImageDataModel(
            " Be strong ",
            R.drawable.img_2
        )
    )

    private lateinit var imageRecyclerView: RecyclerView
    private lateinit var imageAdapter: CardAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageRecyclerView = findViewById(R.id.imageView3)
       imageAdapter = CardAdapter(imagee)
        imageRecyclerView.adapter = imageAdapter

    }


}