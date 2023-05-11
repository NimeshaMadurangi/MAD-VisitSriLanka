package com.example.crudadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.crudadmin.databinding.ActivityUpdateBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Update : AppCompatActivity() {

    private lateinit var binding: ActivityUpdateBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUpdateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
            val uploadNumber = binding.uploadNumber.text.toString()
            val uploadName = binding.uploadName.text.toString()
            val uploadDescription = binding.uploadDescription.text.toString()
            val uploadPrice = binding.uploadPrice.text.toString()
            val uploadDuration = binding.uploadDuration.text.toString()
            val uploadRoute = binding.uploadRoute.text.toString()
            val uploadWay = binding.uploadWay.text.toString()
            val uploadAccommodation = binding.uploadAccommodation.text.toString()
            updateData(uploadNumber,uploadName,uploadDescription,uploadPrice,uploadDuration,uploadRoute,uploadWay,uploadAccommodation)
        }

    }

    private fun updateData(number: String, name: String, description: String, price: String, duration: String, route: String, way: String, accommodation: String){
        database = FirebaseDatabase.getInstance().getReference("Packages")
        val packagedata = mapOf<String,String>(
            "name" to name,
            "description" to description,
            "price" to price,
            "duration" to duration,
            "route" to route,
            "way" to way,
            "accommodation" to accommodation
        )

        database.child(number).updateChildren(packagedata).addOnSuccessListener {
            binding.uploadNumber.text.clear()
            binding.uploadName.text.clear()
            binding.uploadDescription.text.clear()
            binding.uploadPrice.text.clear()
            binding.uploadDuration.text.clear()
            binding.uploadRoute.text.clear()
            binding.uploadWay.text.clear()
            binding.uploadAccommodation.text.clear()
            Toast.makeText(this,"Successfully Updated",Toast.LENGTH_SHORT).show()
        }.addOnFailureListener{
            Toast.makeText(this,"Failed to Update",Toast.LENGTH_SHORT).show()
        }

    }

}