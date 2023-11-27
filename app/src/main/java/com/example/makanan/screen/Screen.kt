package com.example.makanan.screen

sealed class Screen(val route: String) {
    object MenuScreen: Screen("menu")
}
