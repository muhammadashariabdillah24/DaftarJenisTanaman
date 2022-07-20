package com.dicoding.daftarjenistanaman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import java.util.*

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Timer().schedule(object : TimerTask() {
            override fun run() {
                val intent = Intent(this@SplashScreen, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 2000)
    }
}