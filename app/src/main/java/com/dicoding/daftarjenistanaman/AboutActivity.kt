package com.dicoding.daftarjenistanaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.title = null

        val tvMyName: TextView = findViewById(R.id.tv_my_name)
        val tvMyEmail: TextView = findViewById(R.id.tv_my_email)

        val name = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)

        tvMyName.text = name
        tvMyEmail.text = email
    }
}