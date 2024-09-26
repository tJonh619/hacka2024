package com.example.proyectosps

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectosps.databinding.ActivityTratamientosBinding

class TratamientoActivity:AppCompatActivity() {
    private lateinit var binding: ActivityTratamientosBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTratamientosBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
    }
}