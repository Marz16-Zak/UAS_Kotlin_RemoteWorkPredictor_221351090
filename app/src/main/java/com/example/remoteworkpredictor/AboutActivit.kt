package com.example.remoteworkpredictor

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.remoteworkpredictor.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Tentang Aplikasi"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Isi data jika perlu secara dinamis
        binding.tvAppName.text = "Prediksi Remote Work Productivity"
        binding.tvVersion.text = "Versi 1.0"
        binding.tvDescription.text = "Aplikasi ini menggunakan model machine learning (ANN) untuk memprediksi produktivitas kerja jarak jauh berdasarkan parameter tertentu seperti jam kerja, pengalaman, tingkat stress, dan lainnya."
        binding.tvAuthor.text = "Dikembangkan oleh: Muhammad Abdul Rozak\nNIM: 221351090"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
