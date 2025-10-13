package com.example.jugadores_lol.navigation

import kotlinx.serialization.Serializable


    /**
     * Es como si fuera el indice de un libro
     * Tiene que ser @Serializable porque convierte tus clases en datos
     * que se pueden:
     *
     * 1. Pasar entre pantallas de forma segura
     * 2. Guardar en el back stack
     * 3. Restarurar despues de cambios de configuracion
     * */
    @Serializable
    object  ChampionListRoute

    @Serializable
    data class InfoChampionRoute(
        val name:String,
        val description:String,
        val imageUrl: String
    )

    @Serializable
    object CreateChampionRoute
