package com.example.mentalcalculation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
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
            verticalArrangement = Arrangement.Center

        ) {
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Start")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Profile")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Tips")
            }
        }
    }
}

@Preview
@Composable
fun MainScreenPreview() {
    MainScreen()
}