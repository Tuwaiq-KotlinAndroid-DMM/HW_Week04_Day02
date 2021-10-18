package com.example.myownrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val cardView = mutableListOf(
        CardDataModel(
            "Iam proud of my Artist",
            R.drawable.pic1
        ),
        CardDataModel(
            "My lovely Interior Designer",
            R.drawable.pic2
        ),
        CardDataModel(
            "Great Designer who creates different trends",
            R.drawable.pic3
        )

    )




private lateinit var cardRecycleView: RecyclerView
private lateinit var cardAdapter: CardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardRecycleView = findViewById(R.id.card_RecycleView)
        cardAdapter = CardAdapter(cardView)

        cardRecycleView.adapter = cardAdapter




    }
}