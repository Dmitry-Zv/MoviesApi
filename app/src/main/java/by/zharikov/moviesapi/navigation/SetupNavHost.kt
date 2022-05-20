package by.zharikov.moviesapi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import by.zharikov.moviesapi.MainViewModel
import by.zharikov.moviesapi.screens.DetailsScreen
import by.zharikov.moviesapi.screens.MainScreen
import by.zharikov.moviesapi.screens.SplashScreen
import by.zharikov.moviesapi.utils.Constants.Screens.DETAILS_SCREEN
import by.zharikov.moviesapi.utils.Constants.Screens.MAIN_SCREEN
import by.zharikov.moviesapi.utils.Constants.Screens.SPLASH_SCREEN

sealed class Screens(val route: String) {
    object SplashScreen : Screens(route = SPLASH_SCREEN)
    object MainScreen : Screens(route = MAIN_SCREEN)
    object DetailsScreen : Screens(route = DETAILS_SCREEN)
}

@Composable
fun SetupNavHost(navController: NavHostController, viewModel: MainViewModel) {
    NavHost(navController = navController, startDestination = Screens.SplashScreen.route) {
        composable(Screens.SplashScreen.route){
            SplashScreen(navController, viewModel)
        }
        composable(Screens.MainScreen.route){
            MainScreen(navController, viewModel)
        }
        composable(Screens.DetailsScreen.route + "/{Id}"){ backStackEntry ->
            DetailsScreen(navController = navController, viewModel = viewModel, itemId = backStackEntry.arguments?.getString("Id") ?: "1")

        }

    }
}