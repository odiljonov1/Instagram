package com.example.instagram_clone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.lin_container, homeFragment()).commit()
        btn_home.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.lin_container, homeFragment()).commit()
        }
        btn_profile.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.lin_container, listFragment()).commit()
        }
    }
}