package com.broknppl.miniproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class about_layout : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_layout)

        val backbtn : Button = findViewById(R.id.backbtn)

        backbtn.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
    }
}