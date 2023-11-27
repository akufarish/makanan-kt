package com.example.makanan.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.makanan.R

@Composable
fun BottomBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White, RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp))
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 60.dp, end = 60.dp, top = 12.dp)
        ) {
            TextButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Home",
                    tint = colorResource(R.color.secondary),
                    modifier = Modifier
                        .size(40.dp)
                )
            }
            TextButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    Icons.Outlined.DateRange,
                    contentDescription = "Home",
                    tint = Color.Black,
                    modifier = Modifier
                        .size(40.dp)
                )
            }
            TextButton(
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    Icons.Outlined.Person,
                    contentDescription = "Home",
                    tint = Color.Black,
                    modifier = Modifier
                        .size(40.dp)
                )
            }
        }
    }
}