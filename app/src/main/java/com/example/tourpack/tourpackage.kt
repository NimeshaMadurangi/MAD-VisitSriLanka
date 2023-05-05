package com.example.tourpack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class tourpackage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tourpackage)

        val imgCateActbt1 = findViewById<ImageView>(R.id.imgCate1)
        imgCateActbt1.setOnClickListener {
            val Intent = Intent(this,packagedetails::class.java)
            startActivity(Intent)
        }

        val imgCateActbt2 = findViewById<ImageView>(R.id.imgCate2)
        imgCateActbt2.setOnClickListener {
            val Intent = Intent(this,packagedetails::class.java)
            startActivity(Intent)
        }

        val imgCateActbt3 = findViewById<ImageView>(R.id.imgCate3)
        imgCateActbt3.setOnClickListener {
            val Intent = Intent(this,packagedetails::class.java)
            startActivity(Intent)
        }

        val imgCateActbt4 = findViewById<ImageView>(R.id.imgCate4)
        imgCateActbt4.setOnClickListener {
            val Intent = Intent(this,packagedetails::class.java)
            startActivity(Intent)
        }

        val packageActbt1 = findViewById<ImageView>(R.id.package1)
        packageActbt1.setOnClickListener {
            val Intent = Intent(this,packagedetails::class.java)
            startActivity(Intent)
        }

        val packageActbt2 = findViewById<ImageView>(R.id.package2)
        packageActbt2.setOnClickListener {
            val Intent = Intent(this,packagedetails::class.java)
            startActivity(Intent)
        }

        val packageActbt3 = findViewById<ImageView>(R.id.package3)
        packageActbt3.setOnClickListener {
            val Intent = Intent(this,packagedetails::class.java)
            startActivity(Intent)
        }

        val packageActbt4 = findViewById<ImageView>(R.id.package4)
        packageActbt4.setOnClickListener {
            val Intent = Intent(this,packagedetails::class.java)
            startActivity(Intent)
        }

        val packageActbt5 = findViewById<ImageView>(R.id.package5)
        packageActbt5.setOnClickListener {
            val Intent = Intent(this,packagedetails::class.java)
            startActivity(Intent)
        }

        val packageActbt6 = findViewById<ImageView>(R.id.package6)
        packageActbt6.setOnClickListener {
            val Intent = Intent(this,packagedetails::class.java)
            startActivity(Intent)
        }
    }
}