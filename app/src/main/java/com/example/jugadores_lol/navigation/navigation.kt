package com.example.jugadores_lol.navigation

sealed  class AppScreens(val route: String){
    object MainScreen: AppScreens("ChampionsScreen")
    object InfoScreen: AppScreens("InfoChampionScreen")
}