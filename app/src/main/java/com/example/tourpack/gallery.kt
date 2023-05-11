package com.example.tourpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class gallery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Gallery"

    }
}