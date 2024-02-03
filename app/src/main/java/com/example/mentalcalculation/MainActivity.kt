package com.example.mentalcalculation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.mentalcalculation.ui.CalculationApp
import com.example.mentalcalculation.ui.LevelSelectionScreen
import com.example.mentalcalculation.ui.theme.MentalCalculationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MentalCalculationTheme {
                LevelSelectionScreen()
            }
        }
    }
}