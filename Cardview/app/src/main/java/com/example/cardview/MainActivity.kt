package com.example.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val cards= mutableListOf(
       CardDataModel("I can do it",R.drawable.nature1),
       CardDataModel("Never give up", R.drawable.nature2),
        CardDataModel("Challenge yourself",R.drawable.nature3)
    )
    private lateinit var recycle: RecyclerView
    private lateinit var adapter: CardAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycle=findViewById(R.id.recycleview)

        adapter= CardAdapter(cards)
        recycle.adapter=adapter
    }
}