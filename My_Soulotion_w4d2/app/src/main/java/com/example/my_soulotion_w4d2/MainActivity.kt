package com.example.my_soulotion_w4d2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private lateinit var recycle: RecyclerView
    private lateinit var adapter:Adapter
    var list = mutableListOf(
        InformClass("I am strong",R.drawable.pic1),
        InformClass("I believe in myself",R.drawable.pic2),
        InformClass("I am good programming",R.drawable.pic3)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycle  = findViewById(R.id.recycler)

        adapter = Adapter(list)

        recycle.adapter = adapter
    }
}