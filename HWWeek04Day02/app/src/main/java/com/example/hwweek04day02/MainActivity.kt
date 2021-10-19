package com.example.hwweek04day02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val beaches = mutableListOf(
        BeachesDataModel(
            "I Love Beaches",
            R.drawable.img
        ),
        BeachesDataModel(
            "I Like Beaches",
            R.drawable.img_1
        ),
        BeachesDataModel(
            "I am OK with Beaches",
            R.drawable.img_2
        )

    )


    private lateinit var beachRecyclerView: RecyclerView
    private lateinit var beachAdapter: BeachesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        beachRecyclerView = findViewById(R.id.imageview)
        beachAdapter = BeachesAdapter(beaches)
        beachRecyclerView.adapter = beachAdapter

    }


}
