package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val list = mutableListOf(
        AffirmationsData(R.drawable.imag1, "What's wonderfull place"),
        AffirmationsData(R.drawable.imag2, "It's a good one"),
        AffirmationsData(R.drawable.imag3, "It's awesome")
    )

    private lateinit var AffirRecycler : RecyclerView
    private lateinit var AffirAdabter: AffirmationsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AffirRecycler = findViewById(R.id.card_recyclerview)
        AffirAdabter = AffirmationsAdapter(list)

        AffirRecycler.adapter = AffirAdabter

    }
}