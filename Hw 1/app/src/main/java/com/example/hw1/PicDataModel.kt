package com.example.hw1

import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes

data class PicDataModel(
    val textView: String,
    @DrawableRes val imageView: Int
)
