package com.example.remoteworkpredictor

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class SimulasiActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulasi)

        val etJamKerja = findViewById<EditText>(R.id.etJamKerja)
        val etKelelahan = findViewById<EditText>(R.id.etKelelahan)
        val etKonsentrasi = findViewById<EditText>(R.id.etKonsentrasi)
        val btnPrediksi = findViewById<Button>(R.id.btnPrediksi)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btnPrediksi.setOnClickListener {
            val jam = etJamKerja.text.toString().toFloatOrNull()
            val lelah = etKelelahan.text.toString().toIntOrNull()
            val konsen = etKonsentrasi.text.toString().toIntOrNull()

            if (jam == null || lelah == null || konsen == null) {
                Toast.makeText(this, "Isi semua data dengan benar", Toast.LENGTH_SHORT).show()
            } else {
                val skor = (jam * 2) + (konsen * 3) - (lelah * 2)
                val hasil = if (skor > 20) {
                    "Prediksi: Produktif"
                } else {
                    "Prediksi: Tidak Produktif"
                }
                tvHasil.text = hasil
            }
        }
    }
}
