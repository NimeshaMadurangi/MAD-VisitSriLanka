package com.example.tourpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class paymentmethod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paymentmethod)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = ""

        val cardActbt1 = findViewById<CardView>(R.id.cd1)
        cardActbt1.setOnClickListener {
            val Intent = Intent(this,payment::class.java)
            startActivity(Intent)
        }

        val cardActbt2 = findViewById<CardView>(R.id.cd2)
        cardActbt2.setOnClickListener {
            val Intent = Intent(this,payment::class.java)
            startActivity(Intent)
        }

        val cardActbt3 = findViewById<CardView>(R.id.cd3)
        cardActbt3.setOnClickListener {
            val Intent = Intent(this,payment::class.java)
            startActivity(Intent)
        }
    }
}