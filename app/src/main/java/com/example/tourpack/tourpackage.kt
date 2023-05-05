package com.example.tourpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class tourpackage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tourpackage)

        val clickListener = View.OnClickListener {
            val intent = Intent(this, packagedetails::class.java)
            startActivity(intent)
        }

        // Set the click listener to all image views
        findViewById<ImageView>(R.id.imgCate1).setOnClickListener(clickListener)
        findViewById<ImageView>(R.id.imgCate2).setOnClickListener(clickListener)
        findViewById<ImageView>(R.id.imgCate3).setOnClickListener(clickListener)
        findViewById<ImageView>(R.id.imgCate4).setOnClickListener(clickListener)
        findViewById<ImageView>(R.id.package1).setOnClickListener(clickListener)
        findViewById<ImageView>(R.id.package2).setOnClickListener(clickListener)
        findViewById<ImageView>(R.id.package3).setOnClickListener(clickListener)
        findViewById<ImageView>(R.id.package4).setOnClickListener(clickListener)
        findViewById<ImageView>(R.id.package5).setOnClickListener(clickListener)
        findViewById<ImageView>(R.id.package6).setOnClickListener(clickListener)

    }
}