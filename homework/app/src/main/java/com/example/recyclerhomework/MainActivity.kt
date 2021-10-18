package com.example.recyclerhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val card = mutableListOf<Card>(
        Card("My love ",R.drawable.img_3),
        Card("wow!",R.drawable.img),
        Card("kotlin",R.drawable.img_1),
        Card("sun say that time for sleeping",R.drawable.img_2),

        )
    private lateinit var cardRecyclerView: RecyclerView
    private lateinit var cardAdapter: Adapterh
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cardRecyclerView = findViewById(R.id.recyclerView)
        cardAdapter = Adapterh(card)
        cardRecyclerView.adapter = cardAdapter
    }
}