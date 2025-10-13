package com.example.jugadores_lol.ui.theme.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.jugadores_lol.data.Champion
import com.example.jugadores_lol.data.ChampionsRepository
import com.example.jugadores_lol.ui.theme.components.ChampionItem


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ChampionListScreen(
    onChampionClick: (Champion) -> Unit,
    onCreateClick: () -> Unit
) {
    val champions: List<Champion> = ChampionsRepository.getChampions()

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = { Text("League of Legends Champions") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = onCreateClick) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Crear nuevo campeón"
                )
            }
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentPadding = PaddingValues(vertical = 8.dp)
        ) {
            items(
                items = champions,
                key = { it.name }
            ) { champion ->
                // ✅ CORRECCIÓN: Sintaxis correcta con coma
                ChampionItem(
                    champion = champion,
                    onClick = {
                        onChampionClick(champion)
                    }
                )
            }
        }
    }
}