package com.example.tourpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class foreignpackage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foreignpackage)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = ""

        val cardActbt3 = findViewById<CardView>(R.id.cdView3)
        cardActbt3.setOnClickListener {
            val Intent = Intent(this,tourpackage::class.java)
            startActivity(Intent)
        }

        val cardActbt4 = findViewById<CardView>(R.id.cdView4)
        cardActbt4.setOnClickListener {
            val Intent = Intent(this,tourpackage::class.java)
            startActivity(Intent)
        }

        val cardActbt5 = findViewById<CardView>(R.id.cdView5)
        cardActbt5.setOnClickListener {
            val Intent = Intent(this,tourpackage::class.java)
            startActivity(Intent)
        }
    }
}