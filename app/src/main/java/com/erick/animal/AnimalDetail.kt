package com.erick.animal

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AnimalDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_detail)
        val tvTitle = findViewById<TextView>(R.id.tvTitle)
        val tvDetail = findViewById<TextView>(R.id.tvDetail)
        val ivPhoto = findViewById<ImageView>(R.id.ivPhoto)

        val name = intent.getStringExtra("NAME")
        val icon = intent.getIntExtra("ICON", 0)
        val desc = intent.getStringExtra("DESC")
        tvTitle.text = name
        ivPhoto.setImageResource(icon)
        tvDetail.text = desc
    }
}