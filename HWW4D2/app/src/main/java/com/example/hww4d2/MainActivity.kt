package com.example.hww4d2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val cards = mutableListOf(CardsModel("insect 1",R.drawable.a),
        CardsModel("insect 2",R.drawable.b),
        CardsModel("insect 3",R.drawable.c)
    )
    private lateinit var empRecyclerView: RecyclerView
    private lateinit var empAdapter: CardsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        empRecyclerView = findViewById(R.id.emp_recycleview)
        empAdapter = CardsAdapter(cards) // عمل اوبجكت
        empRecyclerView.adapter = empAdapter
    }
}