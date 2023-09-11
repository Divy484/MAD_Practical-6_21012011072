package com.example.mad_practical_6_21012011072

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start : Button = findViewById(R.id.play_button)
        start.setOnClickListener { play() }

        val stop : Button = findViewById(R.id.stop_button)
        stop.setOnClickListener { pause() }
    }

    fun play(){

    }

    fun pause(){

    }
}