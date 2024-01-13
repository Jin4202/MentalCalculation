package com.example.mentalcalculation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LevelSelectionScreen() {
    Scaffold (
        topBar = {
            TopAppBar(title = {
                Text("Calculation App")
            })
        }
    ) { innerPadding ->
        Column (
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row {
                Text(text = "Operations")
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "+")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "-")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "X")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "/")
                }
                Text(text = "x 1")
            }
            Row {
                Text(text = "Numbers")
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "~10")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "~100")
                }
                Text(text = "x 1")
            }
            Row {
                Text(text = "Time")
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "10s")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "7s")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "5s")
                }
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "3s")
                }
                Text(text = "x 1")
            }

        }
    }
}

@Preview
@Composable
fun LevelSelectionScreenPreview() {
    LevelSelectionScreen()
}