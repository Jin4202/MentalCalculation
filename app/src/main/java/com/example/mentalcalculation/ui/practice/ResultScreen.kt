package com.example.mentalcalculation.ui.practice

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ResultScreen(
    onNavigateToMain: () -> Unit,
    point: Int?
) {
    Scaffold (

    ) {
        Column (
            modifier = Modifier.padding(it).fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "Result",
                fontSize = 30.sp
            )
            Text(
                text = "Total Points: $point",
                fontSize = 30.sp
            )
            Button(onClick = onNavigateToMain) {
                Text(
                    text = "Go back to the Main Menu",
                    fontSize = 20.sp
                )
            }
        }
    }
}

@Preview
@Composable
fun PreviewResultScreen() {
    ResultScreen({}, 13000)
}