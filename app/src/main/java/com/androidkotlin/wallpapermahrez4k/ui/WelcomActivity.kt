package com.androidkotlin.wallpapermahrez4k.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.widget.ImageView
import com.androidkotlin.wallpapermahrez4k.Constant.Contants
import com.androidkotlin.wallpapermahrez4k.R
import kotlin.random.Random

class WelcomActivity : AppCompatActivity() {

    lateinit var imageView: ImageView

    var imageList = mutableListOf<Int>(
        R.drawable.image_01,
        R.drawable.image_02,
        R.drawable.image_03,
        R.drawable.image_04,
        R.drawable.image_05,
        R.drawable.image_06,
        R.drawable.image_07,
        R.drawable.image_08,
        R.drawable.image_09,
        R.drawable.image_10,)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcom)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        imageView = findViewById(R.id.imageView)


        var randomValues = Random.nextInt(10 - 0) + 0

        imageView.setImageResource(imageList[randomValues])

        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, Contants.DELAY_TIME_MILLISECOND)


    }
}