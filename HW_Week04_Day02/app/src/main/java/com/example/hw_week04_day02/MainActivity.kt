package com.example.hw_week04_day02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val memes = mutableListOf(
        memeDataClass("Money will spent",R.drawable.meme),
        memeDataClass("Poor Java",R.drawable.kotlinmeme),
        memeDataClass("I even see it in my dreams",R.drawable.everywhere),
        memeDataClass("HTML is a programming language",R.drawable.tele),
        memeDataClass("Catch me if you can",R.drawable.semicolon)
    )
    private lateinit var memeRecyclerView : RecyclerView
    private lateinit var memeAdapter: memeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        memeRecyclerView = findViewById(R.id.recyclerView)
        memeAdapter = memeAdapter(memes)
        memeRecyclerView.adapter = memeAdapter

    }
}