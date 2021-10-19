package com.example.week4day3hw

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(){
    val towerslist = listOf(
        Towers("Effile Tower",R.drawable.eiffletower),
        Towers("Khalifa Tower",R.drawable.khalifatower),
        Towers("Almamlaka Tower",R.drawable.almamlakatower)

    )
    private lateinit var towersRecyclerView: RecyclerView
    private lateinit var towersAdapter: RecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        towersRecyclerView = findViewById(R.id.towers_RecyclerView)
        towersAdapter = RecyclerAdapter(towerslist)

        towersRecyclerView.adapter = towersAdapter

    }

}