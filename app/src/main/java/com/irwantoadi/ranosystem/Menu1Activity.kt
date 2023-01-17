package com.irwantoadi.ranosystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Menu1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu1)
        val btn_back: Button = findViewById(R.id.btn_back)
        val btn_uud: ImageButton = findViewById(R.id.btn_uud)

        btn_back.setOnClickListener {
            finish()
        }
        btn_uud.setOnClickListener {
            val intent = Intent(this@Menu1Activity, Uud45Activity::class.java)
            startActivity(intent)
        }
    }
}