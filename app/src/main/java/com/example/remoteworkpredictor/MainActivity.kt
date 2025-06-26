package com.example.remoteworkpredictor

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Tombol About
        val btnAbout = findViewById<Button>(R.id.btnAbout)
        btnAbout.setOnClickListener {
            val intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }

        // Tombol Fitur
        val btnFitur = findViewById<Button>(R.id.btnFitur)
        btnFitur.setOnClickListener {
            val intent = Intent(this, FiturActivity::class.java)
            startActivity(intent)
        }

        // Tombol Arsitektur Model
        val btnArsitektur = findViewById<Button>(R.id.btnArsitektur)
        btnArsitektur.setOnClickListener {
            val intent = Intent(this, ArsitekturActivity::class.java)
            startActivity(intent)
        }

        // Tombol Simulasi Prediksi
        val btnSimulasi = findViewById<Button>(R.id.btnSimulasi)
        btnSimulasi.setOnClickListener {
            val intent = Intent(this, SimulasiActivity::class.java)
            startActivity(intent)
        }
    }
}
