package com.example.proyectosps

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectosps.databinding.ActivityMainBinding
import com.example.proyectosps.databinding.LayoutMenuBinding

class LayoutActivity:AppCompatActivity() {
    private lateinit var binding: LayoutMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= LayoutMenuBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        binding.citasCard.setOnClickListener {
            clickCard(CitaActivity())
        }
        binding.medicinasCard.setOnClickListener {
            clickCard(MedicinaActivity())
        }
        binding.progresoCard.setOnClickListener {
            clickCard(TratamientoActivity())
        }
        binding.infoPacCard.setOnClickListener {
            clickCard(InfoPacActivity())
        }
    }

    private fun clickCard(activity: Activity) {
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
    }
}