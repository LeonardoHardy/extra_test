package com.example.meuteste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meuteste.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botaoOk.setOnClickListener {
            val nome = binding.editarNome.text.toString()

            val acao = Intent(this, MainActivity2::class.java)
            acao.putExtra("nome", nome)
            startActivity(acao)

        }
    }
}