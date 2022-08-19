package com.example.submissiondicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class DetailActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvName: TextView = findViewById(R.id.bijuu_name)
        val tvDetails: TextView = findViewById(R.id.bijuu_details)
        val tvDescription: TextView = findViewById(R.id.bijuu_desc)
        val tvPhoto: ImageView = findViewById(R.id.bijuu_photo)
        val tvBg: ImageView = findViewById(R.id.bijuu_bg)
        val favButton: Button = findViewById(R.id.btn_fav)

        val bijuuName = intent.getStringExtra("mName")
        val bijuuDetails = intent.getStringExtra("mDetail")
        val bijuuDescription = intent.getStringExtra("mDescription")
        val bijuuPhoto = intent.getIntExtra("mPhoto", 1)
        val bijuuBg = intent.getIntExtra("mBg", 1)

        tvName.text = bijuuName
        tvDetails.text = bijuuDetails
        tvDescription.text = bijuuDescription
        tvPhoto.setImageResource(bijuuPhoto)
        tvBg.setImageResource(bijuuBg)


        favButton.setOnClickListener{
            Toast.makeText(this, "Add To Favorite", Toast.LENGTH_SHORT).show()


        }
    }
}