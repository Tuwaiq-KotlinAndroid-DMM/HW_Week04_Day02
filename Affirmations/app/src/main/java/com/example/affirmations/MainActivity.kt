package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val affirmations = mutableListOf(
        AffirmationDataModel(R.drawable.spring,"I am strong"),
        AffirmationDataModel(R.drawable.autumn,"I believe in myself"),
        AffirmationDataModel(R.drawable.summer, "I am strong"),
        AffirmationDataModel(R.drawable.winter,"I believe in myself")

    )

    private lateinit var affRecyclerView: RecyclerView
    private lateinit var affAdapter : AffirmationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        affRecyclerView = findViewById(R.id.nature_recyclerView)
        affAdapter = AffirmationAdapter(affirmations)

        affRecyclerView.adapter = affAdapter
    }
}