package com.example.jugadores_lol.data

import androidx.compose.runtime.Composable

data class Champion(
    val name:String,
    val description: String,
    val imageUrl: String
)


/*
val = inmutable(no se puede cambiar) mas seguro

En compose se prefiere val para evitar problemas
 */