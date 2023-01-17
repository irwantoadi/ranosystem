package com.irwantoadi.ranosystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Uud45Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uud45)
        val btn_back: Button = findViewById(R.id.btn_back)

        btn_back.setOnClickListener {
            finish()
        }
    }
}