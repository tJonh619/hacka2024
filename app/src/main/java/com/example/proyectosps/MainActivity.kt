package com.example.proyectosps

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectosps.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val moreInfoText: TextView = findViewById(R.id.moreInfoText)
        val welcomeText: TextView = findViewById(R.id.welcomeText)
        val accessButton: Button = findViewById(R.id.accessButton)
        val usernameEditText: EditText = findViewById(R.id.usernameEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
        val pwdol: TextView = findViewById(R.id.pwdol)


        // Configurar el botón "Más información"
        moreInfoText.setOnClickListener {
            // Crear y mostrar el diálogo
            if(accessButton.text == "Acceder")
                showInfoDialog(0)
            else
            showInfoDialog(1)
        }
        // Configurar el botón "Acceder"
        accessButton.setOnClickListener {
            if(accessButton.text == "Acceder")
            {
                // Cambiar el texto de bienvenida
                welcomeText.text = "¿Quieres acceder a tu \n" +
                        "informacion clinica?"

                // Ocultar "Más información"
                moreInfoText.text = "Ingresa tus credenciales ahora"

                // Cambiar el texto del botón a "Ingresar"
                accessButton.text = "Ingresar"

                // Mostrar los campos de ingreso de usuario y contraseña
                usernameEditText.visibility = View.VISIBLE
                passwordEditText.visibility = View.VISIBLE
                pwdol.visibility = View.VISIBLE
            }
            else{
                val intent = Intent().setClass(this, LayoutActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun showInfoDialog(id: Int) {
        // Inflar el layout del diálogo personalizado
        val shape = GradientDrawable()
        shape.cornerRadius = 200f // Establece el radio de las esquinas redondeadas
        shape.setColor(Color.parseColor("#F6F8F7")) // Establece el color de fondo del diálogo

        var dialogView = View(this)
        // Inflar el layout personalizado para el diálogo
        if(id == 0)
            dialogView = LayoutInflater.from(this).inflate(R.layout.more_info_dialog, null)
        else
            dialogView = LayoutInflater.from(this).inflate(R.layout.credential_info_dialog, null)


        // Crear el diálogo de alerta
        val dialogBuilder = AlertDialog.Builder(this)
            .setView(dialogView)
            .setCancelable(true)

        // Crear el diálogo
        val alertDialog = dialogBuilder.create()

    // Aplicar el fondo redondeado al diálogo
        alertDialog.window?.setBackgroundDrawable(shape)

    // Mostrar el diálogo
        alertDialog.show()
    }
}