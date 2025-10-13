package com.example.jugadores_lol.ui.theme.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.jugadores_lol.R
import com.example.jugadores_lol.data.Champion

@Composable
fun ChampionItem(champion: Champion,
                 onClick: () -> Unit){
    Row(
        modifier = Modifier
            .clickable { onClick() }
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically,

        
    ) {
        //Imagen Circular con Coil
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(champion.imageUrl)
                .crossfade(true)
                .build(),
                contentDescription = null,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.padding(16.dp))

        //Texts
        Column {
            Text(
                text = champion.name,
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray
            )
            Row(modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween){
                Text(
                    text = champion.description,
                    style = MaterialTheme.typography.titleMedium
                )
                IconButton(onClick = onClick
                ){
                    Icon(
                        modifier =  Modifier.size(25.dp),
                        painter = painterResource(R.drawable.info_icon),
                        contentDescription = "info"
                    )
                }
            }
        }
    }
}