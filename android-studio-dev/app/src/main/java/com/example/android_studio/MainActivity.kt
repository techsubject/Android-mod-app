package com.example.android_studio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        // GTA V mod
        findViewById<Button>(R.id.bettercarsgtav).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        // F1 car pack
        findViewById<Button>(R.id.f1carpackbutton).setOnClickListener {
            startActivity(Intent(this, Thirdactivity::class.java))
        }

        // Login button
        findViewById<ImageView>(R.id.loginbutton).setOnClickListener {
            startActivity(Intent(this, FourthActivity::class.java))
        }
    }
}
