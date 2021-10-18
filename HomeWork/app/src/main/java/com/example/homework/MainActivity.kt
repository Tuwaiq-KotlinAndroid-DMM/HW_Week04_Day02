package com.example.homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recycle: RecyclerView
    private lateinit var adapter:CardAdapter
    var list = mutableListOf(
        CradViewData("I am strong",R.drawable.img),
        CradViewData("I believe in myself",R.drawable.img_1),
        CradViewData("I am good programming",R.drawable.img_3)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle  = findViewById(R.id.recycle)

        adapter = CardAdapter(list)

        recycle.adapter = adapter

    }
}