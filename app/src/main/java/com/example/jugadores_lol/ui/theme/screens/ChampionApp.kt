package com.example.jugadores_lol.ui.theme.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.jugadores_lol.navigation.ChampionListRoute
import com.example.jugadores_lol.navigation.CreateChampionRoute
import com.example.jugadores_lol.navigation.InfoChampionRoute

@Composable
fun ChampionApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ChampionListRoute
    ) {
        //  Pantalla 1: Lista de campeones
        composable<ChampionListRoute> {
            ChampionListScreen(
                onChampionClick = { champion ->
                    // Pasar los datos del campeón
                    navController.navigate(
                        InfoChampionRoute(
                            name = champion.name,
                            description = champion.description,
                            imageUrl = champion.imageUrl
                        )
                    )
                },
                onCreateClick = {
                    navController.navigate(CreateChampionRoute)
                }
            )
        }

        //  Pantalla 2: Detalle del campeón
        composable<InfoChampionRoute> { backStackEntry ->
            // Extraer los datos de la ruta
            val championInfo = backStackEntry.toRoute<InfoChampionRoute>()

            InfoChampionScreen(
                name = championInfo.name,
                description = championInfo.description,
                imageUrl = championInfo.imageUrl,
                onBackClick = {
                    navController.navigateUp()
                }
            )
        }

        // ✅ Pantalla 3: Crear campeón
        composable<CreateChampionRoute> {
            CreateChampionScreen(
                onChampionCreated = {
                    navController.navigateUp()
                },
                onCancelClick = {
                    navController.navigateUp()
                }
            )
        }
    }
}