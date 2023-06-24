package com.example.meuteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.meuteste.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val acao = intent
        val nome = acao.extras?.getString("nome")

        if (nome.equals("") || nome == null) {
            Toast.makeText(applicationContext, "Nome n~so inserido", Toast.LENGTH_LONG)
        } else {
            binding.apresentaTexto.setText("Olá $nome")
        }
    }
}