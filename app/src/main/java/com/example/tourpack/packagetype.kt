package com.example.tourpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class packagetype : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_packagetype)

        val cardActbt1 = findViewById<CardView>(R.id.cdView1)
        cardActbt1.setOnClickListener {
            val Intent = Intent(this,foreignpackage::class.java)
            startActivity(Intent)
        }

        val cardActbt2 = findViewById<CardView>(R.id.cdView2)
        cardActbt2.setOnClickListener {
            val Intent = Intent(this,tourpackage::class.java)
            startActivity(Intent)
        }
    }
}