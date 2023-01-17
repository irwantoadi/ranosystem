package com.irwantoadi.ranosystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageButton
import android.widget.Toast

class WelcomeActivity : AppCompatActivity() {
    var doubleBackToExitOnce : Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val btn_signup: ImageButton = findViewById(R.id.btn_signup)

        btn_signup.setOnClickListener {
            val intent = Intent(this@WelcomeActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        if (doubleBackToExitOnce){
            super.onBackPressed()
            return
        }

        this.doubleBackToExitOnce = true;

        Toast.makeText(this, getString(R.string.tekan_satu_kali), Toast.LENGTH_SHORT).show()

        Handler(Looper.getMainLooper()).postDelayed({
            kotlin.run { doubleBackToExitOnce = false }
        }, 2000)
    }
}