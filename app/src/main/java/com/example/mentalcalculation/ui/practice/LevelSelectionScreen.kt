package com.example.mentalcalculation.ui.practice

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mentalcalculation.data.LevelState
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LevelSelectionScreen(
    navController: NavController
) {
    val bColorBase = Color(130,109,140)
    val bColorHighlighted = Color(179,136,255)

    var isPlusSelected by remember {
        mutableStateOf(false)
    }
    var isMinusSelected by remember {
        mutableStateOf(false)
    }
    var isMultiplicationSelected by remember {
        mutableStateOf(false)
    }
    var isDivisionSelected by remember {
        mutableStateOf(false)
    }
    var numberLevel by remember {
        mutableIntStateOf(10)
    }
    var timeLevel by remember {
        mutableIntStateOf(10)
    }


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
                .padding(horizontal = 10.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(text = "Operations")
                Button(
                    onClick = {
                        isPlusSelected = !isPlusSelected
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isPlusSelected) bColorHighlighted else bColorBase
                    )
                ) {
                    Text(text = "+")
                }
                Button(
                    onClick = {
                        isMinusSelected = !isMinusSelected
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isMinusSelected) bColorHighlighted else bColorBase
                    )
                ) {
                    Text(text = "-")
                }
                Button(
                    onClick = {
                        isMultiplicationSelected = !isMultiplicationSelected
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isMultiplicationSelected) bColorHighlighted else bColorBase
                    )
                ) {
                    Text(text = "×")
                }
                Button(
                    onClick = {
                        isDivisionSelected = !isDivisionSelected
                              },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (isDivisionSelected) bColorHighlighted else bColorBase
                    )
                ) {
                    Text(text = "÷")
                }
                Text(text = "x 0.4p")
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(text = "Numbers")
                Button(
                    onClick = {
                        numberLevel = 10
                              },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (numberLevel == 10) bColorHighlighted else bColorBase
                    )
                ) {
                    Text(text = "~10")
                }
                Button(
                    onClick = {
                        numberLevel = 100
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (numberLevel == 100) bColorHighlighted else bColorBase
                    )
                ) {
                    Text(text = "~100")
                }
                Text(text = "x 0.5p")
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(text = "Time")
                Button(
                    onClick = {
                        timeLevel = 10
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (timeLevel == 10) bColorHighlighted else bColorBase
                    )
                ) {
                    Text(text = "10s")
                }
                Button(
                    onClick = {
                        timeLevel = 7
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (timeLevel == 7) bColorHighlighted else bColorBase
                    )
                ) {
                    Text(text = "7s")
                }
                Button(
                    onClick = {
                        timeLevel = 5
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (timeLevel == 5) bColorHighlighted else bColorBase
                    )
                ) {
                    Text(text = "5s")
                }
                Text(text = "x 0.1p")
            }
            Column {
                Text(text = "Point Multiplier: " + "x 1")
                Button(onClick = {
                    val levelState = LevelState(listOf(isPlusSelected, isMinusSelected, isMultiplicationSelected, isDivisionSelected), numberLevel, timeLevel)
                    Log.d("Quiz Setting: ", ""+levelState)
                    val stateArg: String = Json.encodeToString(levelState)
                    Log.d("Quiz Arg: ", ""+stateArg)
                    navController.navigate("game/$stateArg")
                }) {
                    Text(text = "Start the Quiz")
                }
            }
        }
    }
}

@Preview
@Composable
fun LevelSelectionScreenPreview() {
    LevelSelectionScreen(rememberNavController())
}