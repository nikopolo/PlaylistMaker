package com.example.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val backButton = findViewById<ImageView>(R.id.backFromSettings)
        backButton.setOnClickListener {
            val backButtonSettings = Intent(this, MainActivity::class.java)
            startActivity(backButtonSettings)
        }


    }
}