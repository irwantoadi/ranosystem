package com.irwantoadi.ranosystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Menu2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)
        val btn_back: Button = findViewById(R.id.btn_back)
        val btn_data: ImageButton = findViewById(R.id.btn_data)

        btn_back.setOnClickListener {
            finish()
        }
        btn_data.setOnClickListener {
            val intent = Intent(this@Menu2Activity, DifabelTiapKecamatanActivity::class.java)
            startActivity(intent)
        }
    }
}