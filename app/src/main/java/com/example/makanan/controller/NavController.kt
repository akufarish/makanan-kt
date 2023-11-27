package com.example.makanan.controller

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.makanan.screen.Screen
import com.example.makanan.views.Menu

@Composable
fun Navigate() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.MenuScreen.route
    ) {
        composable(route = Screen.MenuScreen.route) {
            Menu(navController)
        }
    }
}