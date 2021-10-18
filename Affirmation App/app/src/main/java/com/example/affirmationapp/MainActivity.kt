package com.example.affirmationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val affirmationList =
        listOf(AffirmationDataModel("I AM DOING MY BEST", R.drawable.img),
            AffirmationDataModel("I AM WORTHY", R.drawable.img_2),
            AffirmationDataModel("I AM FREE OF WORRY AND REGRET", R.drawable.img_3),
            AffirmationDataModel("I AM BECOMING A BETTER VERSION OF MYSELF", R.drawable.img_4))


    private lateinit var affir_recyclerView: RecyclerView
    private lateinit var affir_adapter: AffirmationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        affir_recyclerView = findViewById(R.id.affirmation_recyclerView)
       // object of the adapter
        affir_adapter = AffirmationAdapter(affirmationList)

        // to make the connection between the recyclerview and its adapter

        affir_recyclerView.adapter = affir_adapter


    }


}