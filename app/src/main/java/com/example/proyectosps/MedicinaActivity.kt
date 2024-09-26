package com.example.proyectosps

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectosps.databinding.ActivityMedicinasBinding

class MedicinaActivity:AppCompatActivity() {
    private lateinit var binding: ActivityMedicinasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMedicinasBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
    }
}