package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: Adapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        var list = mutableListOf<Cards>(
            Cards("I am strong", R.drawable.image1),
            Cards("I am the best developer", R.drawable.image2),
            Cards("Nothing will stop me", R.drawable.image3),
            Cards("I am going to achieve my goals", R.drawable.image4)
        )
        adapter = Adapter(list)
        recyclerView.adapter = adapter


    }
}