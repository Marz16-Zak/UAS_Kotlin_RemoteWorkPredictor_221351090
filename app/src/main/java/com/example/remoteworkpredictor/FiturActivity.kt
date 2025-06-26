package com.example.remoteworkpredictor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FiturActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fitur)
        supportActionBar?.title = "Fitur Aplikasi"
    }
}
