package com.example.mentalcalculation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculationApp() {
    var userInputText by remember { mutableStateOf("0") }

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
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "5 x 5 =",
                fontSize = 50.sp,
            )
            Text(
                text = "25",
                fontSize = 30.sp,
            )
            Row (
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
            ) {
                Column (
                    modifier = Modifier.padding(end = 20.dp)
                ) {
                    val keypadRowModifier = Modifier
                        .align(Alignment.CenterHorizontally)
                    val buttonModifier = Modifier
                        .padding(
                            start = 5.dp,
                            end = 5.dp,
                        )
                    Row (
                        modifier = keypadRowModifier,
                    ) {
                        Button(
                            onClick = {},
                        ) {
                            Text(text = "1")
                        }
                        Button(
                            onClick = {},
                            modifier = buttonModifier,
                        ) {
                            Text(text = "2")
                        }
                        Button(
                            onClick = {},
                        ) {
                            Text(text = "3")
                        }
                    }
                    Row (
                        modifier = keypadRowModifier,
                    ) {
                        Button(
                            onClick = {},
                        ) {
                            Text(text = "4")
                        }
                        Button(
                            onClick = {},
                            modifier = buttonModifier,
                        ) {
                            Text(text = "5")
                        }
                        Button(
                            onClick = {},
                        ) {
                            Text(text = "6")
                        }
                    }
                    Row (
                        modifier = keypadRowModifier,
                    ) {
                        Button(
                            onClick = {},
                        ) {
                            Text(text = "7")
                        }
                        Button(
                            onClick = {},
                            modifier = buttonModifier,
                        ) {
                            Text(text = "8")
                        }
                        Button(
                            onClick = {},
                        ) {
                            Text(text = "9")
                        }
                    }
                    Row (
                        modifier = keypadRowModifier,
                    ) {
                        Button(onClick = {}) {
                            Text(text = "0")
                        }
                    }
                }
                Column {
                    Button(onClick = {}) {
                        Text(text = "Delete")
                    }
                    Button(onClick = {}) {
                        Text(text = "Clear")
                    }
                    Button(onClick = {}) {
                        Text(text = "Submit")
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun CalculationAppPreview() {
    CalculationApp()
}
