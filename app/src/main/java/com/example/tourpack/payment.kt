package com.example.tourpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Checkout"

        val btnActbt1 = findViewById<Button>(R.id.button2)
        btnActbt1.setOnClickListener {
            val Intent = Intent(this,paymentsuccess::class.java)
            startActivity(Intent)
        }
    }
}