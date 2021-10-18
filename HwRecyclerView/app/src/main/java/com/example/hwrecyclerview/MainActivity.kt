package com.example.hwrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val me = mutableListOf(
        MydataModel("am strong", R.drawable.img),
    (MydataModel("i belive in My self ", R.drawable.img_1)),
    (MydataModel("i am champion ", R.drawable.img_2))


    )

    private lateinit var myRecyclerView: RecyclerView
    private lateinit var myAdapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.myRecyclerview)
        myAdapter = MyAdapter(me)
        myRecyclerView.adapter = myAdapter
    }
}