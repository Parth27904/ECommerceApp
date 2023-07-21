package com.example.ecom

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class activity_prod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prod)

        var backbutton = findViewById<ImageView>(R.id.backbutton)
        var prod_cart = findViewById<ImageView>(R.id.prod_cart)
        var prod = findViewById<ImageView>(R.id.prod)

        backbutton.setOnClickListener {
            intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
    }




}