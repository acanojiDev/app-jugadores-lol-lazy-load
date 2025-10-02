package com.example.jugadores_lol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.jugadores_lol.ui.theme.JugadoreslolTheme
import com.example.jugadores_lol.ui.theme.screens.ChampionScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JugadoreslolTheme {
                Surface(color = MaterialTheme.colorScheme.background ) {
                    ChampionScreen()
                }
            }
        }
    }
}
