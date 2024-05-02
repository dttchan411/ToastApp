package com.example.toastapp

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_toast: Button = findViewById(R.id.button_toast) // toast 버튼에 대해
        button_toast.setOnClickListener {
            Toast.makeText(this, "TOAST 메시지", Toast.LENGTH_SHORT).show()
        }

        val count_random: TextView = findViewById(R.id.count_random) // 변하는 숫자에 대해
        var count: Int = 1
        count_random.text = count.toString()

        val button_count: Button = findViewById(R.id.button_count) // count 버튼에 대해
        button_count.setOnClickListener {
            count++
            count_random.text = count.toString() // 숫자 증가된 상태로 뷰 갱신
        }

        val button_random: Button = findViewById(R.id.button_random)
        button_random.setOnClickListener {
            val intent = Intent(this, RandomActivity::class.java) // RandomActivity로 이동
            intent.putExtra("count", count)
            startActivity(intent)
        }
    }
}