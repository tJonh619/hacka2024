package com.example.proyectosps

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectosps.databinding.ActivityInfoPacBinding

class InfoPacActivity:AppCompatActivity() {
    private lateinit var binding: ActivityInfoPacBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityInfoPacBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
    }
}