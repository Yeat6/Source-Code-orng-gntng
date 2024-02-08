package com.broknppl.miniproject

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class lyrics_and_information : AppCompatActivity() {
    private lateinit var rv : RecyclerView
    private val list : ArrayList<Songs> = arrayListOf()

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lyrics_and_information)

        list.addAll(DataSongs.listsongs)
        rv = findViewById(R.id.myRV)
        rv.setHasFixedSize(true)

        val layoutManager = LinearLayoutManager(this)
        rv.layoutManager = layoutManager

        val adapter = ListSongsAdapter(list)
        rv.adapter = adapter

    }
}