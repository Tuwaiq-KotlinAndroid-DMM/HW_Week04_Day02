package com.example.myownrecyclerview

import android.widget.ImageView
import androidx.annotation.DrawableRes

data class CardDataModel(
    val proudText: String,
    @DrawableRes val img: Int
)
