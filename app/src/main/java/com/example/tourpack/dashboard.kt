package com.example.tourpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val linearActbt2 = findViewById<LinearLayout>(R.id.packagebtn)
        linearActbt2.setOnClickListener {
            val Intent = Intent(this,packagetype::class.java)
            startActivity(Intent)
        }
    }
}