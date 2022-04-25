package com.example.tweenanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image: ImageView = findViewById(R.id.imageView)

        val button_scale: Button = findViewById(R.id.scale)
        val button_alpha: Button = findViewById(R.id.alpha)
        val button_translate: Button = findViewById(R.id.translate)
        val button_rotate: Button = findViewById(R.id.rotate)
        val button_custom: Button = findViewById(R.id.custom)

        val anim_scale = AnimationUtils.loadAnimation(this, R.anim.scale)
        val anim_alpha = AnimationUtils.loadAnimation(this, R.anim.alpha)
        val anim_translate = AnimationUtils.loadAnimation(this, R.anim.translate)
        val anim_rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        val anim_custom = AnimationUtils.loadAnimation(this, R.anim.custom)

        button_scale.setOnClickListener {
            image.startAnimation(anim_scale)
        }

        button_alpha.setOnClickListener {
            image.startAnimation(anim_alpha)
        }

        button_translate.setOnClickListener {
            image.startAnimation(anim_translate)
        }

        button_rotate.setOnClickListener {
            image.startAnimation(anim_rotate)
        }

        button_custom.setOnClickListener {
            image.startAnimation(anim_custom)
        }
    }
}