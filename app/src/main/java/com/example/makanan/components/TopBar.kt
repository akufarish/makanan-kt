package com.example.makanan.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.makanan.R

@Composable
fun TopBar() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 25.dp, start = 12.dp, end = 20.dp)
    ) {
        Box {
            TextButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    Icons.Filled.Menu,
                    contentDescription = "Menu",
                    tint = Color.Black
                )
            }
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Icon(
                Icons.Filled.LocationOn,
                contentDescription = "Lokasi",
                tint = colorResource(R.color.secondary)
            )
            Text(
                text = "Agrabad 435, Chittagong",
                color = Color.Black
            )
        }

        Box {
            TextButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "Profil",
                    tint = Color.Black
                )
            }
        }
    }
}