package com.example.modulo05

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.modulo05.ui.theme.Modulo05Theme
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : ComponentActivity() {
    val button: Button by lazy { findViewById(R.id.button) }
    val imagebutton: ImageButton by lazy { findViewById(R.id.imagenButton) }
    val togglebutton: ToggleButton by lazy { findViewById(R.id.toggleButton) }
    val fab: FloatingActionButton by lazy { findViewById(R.id.fab) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        setupButton()
        setupImageButton()
        setupToggleButton()
        setupFAB()
    }

    private fun setupButton() {
        button.setOnClickListener {
            Toast.makeText(this, "Clique rapido no boton", Toast.LENGTH_SHORT).show()
        }

        button.setOnLongClickListener {
            Toast.makeText(this, "Clique longo no boton", Toast.LENGTH_SHORT).show()
            true
        }

    }

    private  fun setupImageButton() {
        imagebutton.setOnClickListener {
            Toast.makeText(this, "Clique rapido no Imagen Button", Toast.LENGTH_SHORT).show()
        }
        imagebutton.setOnLongClickListener {
            Toast.makeText(this, "Clique longo no Imagen Button", Toast.LENGTH_SHORT).show()
            true
        }
    }

    private fun setupToggleButton() {
        togglebutton.setOnCheckedChangeListener { _, isCheked ->
            if (isCheked){
                Toast.makeText(this, "Toggle Ligado", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Toggle Desligado", Toast.LENGTH_SHORT).show()
            }
        }
      }

    private fun setupFAB() {
        fab.setOnClickListener {
            Toast.makeText(this, "Clique no FAB", Toast.LENGTH_SHORT).show()
        }
    }

}










