package com.example.ecom

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ActionTypes
import com.denzcoskun.imageslider.constants.AnimationTypes
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemChangeListener
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.interfaces.TouchListener
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var drawerlayout = findViewById<DrawerLayout>(R.id.my_drawer_layout)
        var toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)


        val toggle = ActionBarDrawerToggle(this,drawerlayout,toolbar,R.string.navigation_open,R.string.navigation_close)

        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()

        var coke = findViewById<ImageView>(R.id.coke)
        var all = findViewById<ImageView>(R.id.all)
        var pringles = findViewById<ImageView>(R.id.pringles)
        var doritos = findViewById<ImageView>(R.id.doritos)
        var dairymilk = findViewById<ImageView>(R.id.dairymilk)
        var mad = findViewById<ImageView>(R.id.mad)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider) // init imageSlider

        val imageList = ArrayList<SlideModel>() // Create image list
        imageList.add(SlideModel("https://images.freekaamaal.com/featured_images/Untitled8041.jpg"))
        imageList.add(SlideModel("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhEeOsSGwxACfg72ngb9O1SNY4zdhbChq1FQ&usqp=CAU"))
        imageList.add(SlideModel("https://d2pyicwmjx3wii.cloudfront.net/s/60a39f1801d30d79c4caa94b/6417f59ddda4e25adf259cfa/webp/frozen-veg-snacks-220x220.jpg"))

        imageSlider.setImageList(imageList,ScaleTypes.FIT)
        imageSlider.setSlideAnimation(AnimationTypes.ZOOM_OUT)


        coke.setOnClickListener {
            intent = Intent(applicationContext,cokeprod::class.java)
            startActivity(intent)
        }

        all.setOnClickListener {
            intent = Intent(applicationContext,activity_prod::class.java)
            startActivity(intent)
        }

        doritos.setOnClickListener {
            intent = Intent(applicationContext,doritosprod::class.java)
            startActivity(intent)
        }

        pringles.setOnClickListener {
            intent = Intent(applicationContext,pringlesprod::class.java)
            startActivity(intent)
        }

        mad.setOnClickListener {
            intent = Intent(applicationContext,madAngles::class.java)
            startActivity(intent)
        }

        dairymilk.setOnClickListener {
            intent = Intent(applicationContext,cadbury::class.java)
            startActivity(intent)
        }
    }




}