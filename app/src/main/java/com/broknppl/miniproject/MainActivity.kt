package com.broknppl.miniproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnlyrics : Button = findViewById(R.id.Nextbtn)

        btnlyrics.setOnClickListener{
            val intent = Intent(this,lyrics_and_information::class.java)
                 startActivity(intent)
        }

        val btnabout : Button = findViewById(R.id.Aboutbtn)

        btnabout.setOnClickListener{
            val intent2 = Intent(this,about_layout::class.java)
            startActivity(intent2)
        }
    }
}