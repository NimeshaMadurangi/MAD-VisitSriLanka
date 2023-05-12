package com.example.tourpack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.tourpack.databinding.ActivityRetrievedataBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class retrievedata : AppCompatActivity() {

    private lateinit var binding: ActivityRetrievedataBinding
    private lateinit var database : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRetrievedataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.title = ""

        binding.searchButton.setOnClickListener {
            val searchPackage : String = binding.searchPackage.text.toString()
            if  (searchPackage.isNotEmpty()){
                readData(searchPackage)
            }else{
                Toast.makeText(this,"Please enter the package number",Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun readData(number: String){
        database = FirebaseDatabase.getInstance().getReference("Packages")
        database.child(number).get().addOnSuccessListener {
            if (it.exists()){
                val name = it.child("name").value
                val description = it.child("description").value
                val price = it.child("price").value
                val duration = it.child("duration").value
                val route = it.child("route").value
                val way = it.child("way").value
                val accommodation = it.child("accommodation").value
                Toast.makeText(this,"Results Found",Toast.LENGTH_SHORT).show()
                binding.searchPackage.text.clear()
                binding.readName.text = name.toString()
                binding.readdescription.text = description.toString()
                binding.readPrice.text = price.toString()
                binding.readDuration.text = duration.toString()
                binding.readRoute.text = route.toString()
                binding.readWay.text = way.toString()
                binding.readAccommodation.text = accommodation.toString()
            }else{
                Toast.makeText(this,"Package number does not exist",Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener{
            Toast.makeText(this,"Something went wrong",Toast.LENGTH_SHORT).show()
        }

    }

}