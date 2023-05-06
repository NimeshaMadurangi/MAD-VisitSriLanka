package com.example.tourpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class paymentsuccess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paymentsuccess)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = "Confirmation"
    }
}