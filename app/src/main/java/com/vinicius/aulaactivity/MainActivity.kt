package com.vinicius.aulaactivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.vinicius.aulaactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("ciclo_de_vida", "onCreate")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNextScreen.setOnClickListener {
            val intent = Intent(this, DetalhesActivity::class.java)

            // Podemos usar a intent para passar parametros para próxima tela
            // O primeiro valor é o identificador, o que estou querendo passar
            /*
                intent.putExtra("filme", "The Witcher")
                intent.putExtra("classificacao", 5)
                intent.putExtra("avaliacao", 9.2)
             */

            val filme = Filme(
                "Sem limites",
                "Teste",
                4.8,
                "Vinicius",
                "Netflix"
            )

            intent.putExtra("filme", filme)
            startActivity( intent )


        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("ciclo_de_vida", "onStart")
        // Pode ser utilizado para carregar os Dados
    }

    override fun onResume() {
        super.onResume()
        Log.i("ciclo_de_vida", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("ciclo_de_vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("ciclo_de_vida", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("ciclo_de_vida", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("ciclo_de_vida", "onDestroy")
    }
}