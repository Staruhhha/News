package com.example.newsv2

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val item = intent.getParcelableExtra<ItemOfList>("OBJECT INTENT")

        val imgS =  findViewById<ImageView>(R.id.Detail)
        val imgT = findViewById<TextView>(R.id.Title)
        val imgD = findViewById<TextView>(R.id.info)

        imgS.setImageResource(item.imageSrc)
        imgT.text = item.imageTitle
        imgD.text = item.imageDesc
    }
}