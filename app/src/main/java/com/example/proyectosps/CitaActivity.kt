package com.example.proyectosps

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectosps.databinding.ActivityCitaBinding

class CitaActivity:AppCompatActivity() {
    private lateinit var binding: ActivityCitaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCitaBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
    }
}