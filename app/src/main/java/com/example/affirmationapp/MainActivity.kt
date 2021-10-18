package com.example.affirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val carlList= listOf(
        CardContent("I Am Strong!",R.drawable.img),
        CardContent("Never GiveUp Easily!",R.drawable.img_1),
        CardContent("I believe in Myself!",R.drawable.img_2),
        CardContent("Keep Smiling!",R.drawable.img_3)
    )
    private lateinit var cardLayout:RecyclerView
    private lateinit var adaptors:RecyclerAdaptor
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cardLayout=findViewById(R.id.aff_recycler_view)
        adaptors=RecyclerAdaptor(carlList)
        cardLayout.adapter=adaptors



    }
}