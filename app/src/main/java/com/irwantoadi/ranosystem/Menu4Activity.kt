package com.irwantoadi.ranosystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Menu4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu4)
        val btn_back: Button = findViewById(R.id.btn_back)
        val btn_pelatihan: ImageButton = findViewById(R.id.btn_pelatihan)

        btn_back.setOnClickListener {
            finish()
        }
        btn_pelatihan.setOnClickListener {
            val intent = Intent(this@Menu4Activity, PelatihanActivity::class.java)
            startActivity(intent)
        }
    }
}