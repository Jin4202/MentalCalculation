package com.example.mentalcalculation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ResultScreen(
    onNavigateToMain: () -> Unit,
) {
    Scaffold {
        Column (
            modifier = Modifier.padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Result")
            Text(text = "Total Points: 12000")
            Button(onClick = onNavigateToMain) {
                Text(text = "Go back to the Main Menu")
            }
        }
    }
}

@Preview
@Composable
fun PreviewResultScreen() {
    ResultScreen({})
}