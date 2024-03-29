package com.example.mentalcalculation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.mentalcalculation.ui.practice.GameScreen
import com.example.mentalcalculation.ui.practice.LevelSelectionScreen
import com.example.mentalcalculation.ui.MainScreen
import com.example.mentalcalculation.ui.practice.ResultScreen
import com.example.mentalcalculation.ui.theme.MentalCalculationTheme
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MentalCalculationTheme {
                MentalCalculationApp()
            }
        }
    }
}

@Composable
fun MentalCalculationApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "main") {
        composable("main") {
            MainScreen(
                onNavigateToLevel = { navController.navigate("level")},
            )
        }
        composable(
            "level",
        ) {
            LevelSelectionScreen(
                navController
            )
        }
        composable(
            "game/{state}",
            arguments = listOf(navArgument("state") {type = NavType.StringType})
        ) { backStackEntry ->
            GameScreen(
                navController,
                backStackEntry.arguments?.getString("state")
            )
        }
        composable(
            "result/{point}",
            arguments = listOf(navArgument("point") { type = NavType.IntType })
        ) {backStackEntry ->
            ResultScreen(
                onNavigateToMain = { navController.navigate("main")},
                backStackEntry.arguments?.getInt("point")
            )
        }
    }
}