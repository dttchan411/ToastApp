package com.example.toastapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random
import android.app.Activity
import androidx.activity.OnBackPressedCallback

class RandomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)

        val count = intent.getIntExtra("count", 0) //MainActivity에서 가져온 값

        val count2_random: TextView = findViewById(R.id.count2_random)
        val count3_random = Random.nextInt(0, count + 1) // 랜덤 숫자
        count2_random.text = count3_random.toString()
    }
}