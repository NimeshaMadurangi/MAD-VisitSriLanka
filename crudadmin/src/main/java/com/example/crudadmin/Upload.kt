package com.example.crudadmin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.crudadmin.databinding.ActivityUploadBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Upload : AppCompatActivity() {

    private lateinit var binding: ActivityUploadBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUploadBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {

            val number = binding.uploadNumber.text.toString()
            val name = binding.uploadName.text.toString()
            val description = binding.uploadDescription.text.toString()
            val price = binding.uploadPrice.text.toString()
            val rating = binding.uploadRating.text.toString()

            database = FirebaseDatabase.getInstance().getReference("Packages")
            val packages = PackageData(number,name,description,price,rating)
            database.child(rating).setValue(packages).addOnSuccessListener {
                binding.uploadNumber.text.clear()
                binding.uploadName.text.clear()
                binding.uploadDescription.text.clear()
                binding.uploadPrice.text.clear()
                binding.uploadRating.text.clear()

                Toast.makeText(this,"Saved", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@Upload, MainActivity::class.java)
                startActivity(intent)
                finish()

            }.addOnFailureListener{
                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
            }

        }
    }
}