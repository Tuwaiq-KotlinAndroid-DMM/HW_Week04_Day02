package com.example.affirmationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val intent=Intent(this,MainActivity::class.java)
        object:CountDownTimer(1500,1000){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
               startActivity(intent)
            }

        }.start()
    }
}