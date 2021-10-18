package com.example.week4_day2hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val affirmationList = mutableListOf(
        AffirmationDataClass
            ("I am strong", R.drawable.strong),
        AffirmationDataClass("I believe in myself", R.drawable.ibelieve))

    private lateinit var recyclerView: RecyclerView
    private lateinit var affAdapter: AffirmationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        affAdapter =  AffirmationAdapter(affirmationList)
        recyclerView.adapter = affAdapter


    }
}