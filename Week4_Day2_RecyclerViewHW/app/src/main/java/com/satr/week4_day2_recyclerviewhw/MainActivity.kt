package com.satr.week4_day2_recyclerviewhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var affirmationsList = mutableListOf(
        AffirmationsDataModel(
            "I am strong",
            R.drawable.nature1
        ),
        AffirmationsDataModel(
            "I believe in myself",
            R.drawable.nature2
        ),
        AffirmationsDataModel(
            "Today, I am brimming with energy and overflowing with joy",
            R.drawable.nature3
        ),
        AffirmationsDataModel(
            " I am courageous and I stand up for myself",
            R.drawable.nature4
        ),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val affirmationsAdapter = AffirmationsAdapter(affirmationsList)
        recyclerView.adapter = affirmationsAdapter
    }
}