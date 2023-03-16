package com.cassioluciano.glideloadimagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img = findViewById<ImageView>(R.id.imageView)
        Glide.with(this).load("https://cafeinacodificada.com.br/wp-content/uploads/2019/02/kotlin.jpg").into(img)
       // Glide.with(img).load("https://cafeinacodificada.com.br/wp-content/uploads/2019/02/kotlin.jpg").into(img)


    }
}