package com.example.crudadmin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.crudadmin.databinding.ActivityDeleteBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Delete : AppCompatActivity() {

    private lateinit var binding: ActivityDeleteBinding
    private lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeleteBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.saveButton.setOnClickListener {
            val number = binding.uploadNumber.text.toString()
            if (number.isNotEmpty())
                deleteData(number)
            else
                Toast.makeText(this, "Please enter the Package Number", Toast.LENGTH_SHORT).show()
        }

    }

    private fun deleteData(number: String) {
        database = FirebaseDatabase.getInstance().getReference("Users")
        database.child(number).removeValue().addOnSuccessListener {
            binding.uploadNumber.text.clear()
            Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show()
        }.addOnFailureListener {
            Toast.makeText(this, "Unable to delete", Toast.LENGTH_SHORT).show()
        }
    }
}