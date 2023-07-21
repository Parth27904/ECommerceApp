package com.example.ecom

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class pringlesprod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pringles)

        var backbutton = findViewById<ImageView>(R.id.backbutton)
        var prod_cart = findViewById<ImageView>(R.id.prod_cart)

        backbutton.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}