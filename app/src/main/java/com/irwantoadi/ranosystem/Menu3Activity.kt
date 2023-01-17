package com.irwantoadi.ranosystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Menu3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu3)
        val btn_back: Button = findViewById(R.id.btn_back)
        val btn_kec: ImageButton = findViewById(R.id.btn_kec)

        btn_back.setOnClickListener {
            finish()
        }
        btn_kec.setOnClickListener {
            val intent = Intent(this@Menu3Activity, KedungtubanActivity::class.java)
            startActivity(intent)
        }
    }
}