package com.kotlin.homeworkweek4day2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val expressionPhotos= mutableListOf(

        ExpressionPhotos(R.drawable.strong, "Iam Strong"),
        ExpressionPhotos(R.drawable.active, "I feel a live "),
        ExpressionPhotos(R.drawable.believe, "believe in your self"))


        private lateinit var recyclerView: RecyclerView
        private lateinit var expressionAdapter: ExpressionAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            recyclerView = findViewById(R.id.recyceler_view)
            expressionAdapter = ExpressionAdapter(expressionPhotos)

            recyclerView.adapter =  expressionAdapter
    }

}