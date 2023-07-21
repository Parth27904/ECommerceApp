package com.example.ecom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class cadbury : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadbury)

        var backbutton = findViewById<ImageView>(R.id.backbutton)
        var prod_cart = findViewById<ImageView>(R.id.prod_cart)
        var prod = findViewById<ImageView>(R.id.cadburyprod)

        backbutton.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}