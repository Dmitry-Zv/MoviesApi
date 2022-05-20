package by.zharikov.moviesapi.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import by.zharikov.moviesapi.MainViewModel

@Composable
fun DetailsScreen(navController: NavController, viewModel: MainViewModel, itemId: String) {
    Text(text = "Details screen item id: ${itemId}")
}