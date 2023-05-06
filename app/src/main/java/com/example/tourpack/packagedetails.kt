package com.example.tourpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class packagedetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_packagedetails)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = ""

        val btnActbt1 = findViewById<Button>(R.id.button)
        btnActbt1.setOnClickListener {
            val Intent = Intent(this,paymentmethod::class.java)
            startActivity(Intent)
        }
    }
}