package com.vinicius.aulaactivity

import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vinicius.aulaactivity.databinding.ActivityDetalhesBinding

class DetalhesActivity: AppCompatActivity() {

    private lateinit var binding: ActivityDetalhesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Para buscar os valores da Activity, criamos uma variavel para agrupar esses dados
        // ao usar o intent.extras ele recebe "todos os parâmentros passados

        val bundle = intent.extras
        if (bundle != null) {

            /*
                val filme = bundle.getString("filme")
                val classificacao = bundle.getInt("classificacao")
                val avaliacao = bundle.getDouble("avaliacao")

                val resultado = "Filme: $filme \nClassificação: $classificacao \nAvaliação: $avaliacao"
            */

            val filme = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                // bundle.getSerializable("filme", Filme::class.java)
                bundle.getParcelable("filme", Filme::class.java)
            } else {
                // bundle.getSerializable("filme") as Filme
                bundle.getParcelable("filme")
            }

            binding.textDescription.text = "${filme?.nome} \n${{filme?.descricao}} \n${filme?.avaliacoes} \n${filme?.diretor} \n${filme?.distribuidor}"
        }

        binding.btnReturn.setOnClickListener {
            finish()
        }
    }

}