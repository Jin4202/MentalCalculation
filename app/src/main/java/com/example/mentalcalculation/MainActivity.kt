package com.example.mentalcalculation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mentalcalculation.ui.CalculationApp
import com.example.mentalcalculation.ui.LevelSelectionScreen
import com.example.mentalcalculation.ui.MainScreen
import com.example.mentalcalculation.ui.ResultScreen
import com.example.mentalcalculation.ui.theme.MentalCalculationTheme

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
        composable("main") { MainScreen(
            onNavigateToLevel = { navController.navigate("level")},
        ) }
        composable("level") {LevelSelectionScreen(
            onNavigateToGame = { navController.navigate("game") },
        )}
        composable("game") {CalculationApp(
            onNavigateToResult = { navController.navigate("result") },
        )}
        composable("result") { ResultScreen(
            onNavigateToMain = { navController.navigate("main") },
        ) }
    }
}