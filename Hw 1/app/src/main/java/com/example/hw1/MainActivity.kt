package com.example.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val pics = mutableListOf<PicDataModel>(
PicDataModel("Taken by Mustafa",R.drawable.img),
        PicDataModel("Taken by Ali",R.drawable.img_1),
        PicDataModel("Taken by Abdullah",R.drawable.img_2),
        PicDataModel("Taken by Mr.Mohamed",R.drawable.img_3)
    )

    private lateinit var picRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {

        var card1 = PicAdapter(pics)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        picRecyclerView = findViewById(R.id.pic_recycler_view)
        picRecyclerView.adapter = card1
        val pic = PicDataModel("taken by Mustafa",R.drawable.img)



    }
}