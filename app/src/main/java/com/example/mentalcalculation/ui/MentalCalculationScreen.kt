package com.example.mentalcalculation.ui

import android.os.CountDownTimer
import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.delay
import java.util.concurrent.TimeUnit

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculationApp(
    navController: NavController
) {
    var userInputText by remember { mutableStateOf("") }
    var point by remember { mutableIntStateOf(1000) }

    val timeLimit = 10

    var quiz = Quiz()
    var quizLeft by remember { mutableIntStateOf(10) }
    var timeLeft by remember {mutableStateOf("0.0")}
    val timer by remember {
        mutableStateOf(
            object : CountDownTimer((timeLimit*1000).toLong(), 100) {
                override fun onTick(millisUntilFinished: Long) {
                    timeLeft = String.format("%d:%d", millisUntilFinished/1000, millisUntilFinished/100%10)
                }
                override fun onFinish() {
                    timeLeft = "Time Over"
                    point -= 100

                }
            }
        )
    }
    LaunchedEffect(Unit) {
        timer.start()
        //Log.d("Refresh", "Timer started.")
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
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = quiz.getQuizString() + " =",
                fontSize = 50.sp,
            )
            Text(
                text = userInputText,
                fontSize = 30.sp,
            )
            Text(
                text = "Time Left: $timeLeft",
                fontSize = 20.sp
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
                            onClick = {
                                userInputText += 1
                            },
                        ) {
                            Text(
                                text = "1",
                            )
                        }
                        Button(
                            onClick = {
                                userInputText += 2
                            },
                            modifier = buttonModifier,
                        ) {
                            Text(text = "2")
                        }
                        Button(
                            onClick = {
                                userInputText += 3
                            },
                        ) {
                            Text(text = "3")
                        }
                    }
                    Row (
                        modifier = keypadRowModifier,
                    ) {
                        Button(
                            onClick = {
                                userInputText += 4
                            },
                        ) {
                            Text(text = "4")
                        }
                        Button(
                            onClick = {
                                userInputText += 5
                            },
                            modifier = buttonModifier,
                        ) {
                            Text(text = "5")
                        }
                        Button(
                            onClick = {
                                userInputText += 6
                            },
                        ) {
                            Text(text = "6")
                        }
                    }
                    Row (
                        modifier = keypadRowModifier,
                    ) {
                        Button(
                            onClick = {
                                userInputText += 7
                            },
                        ) {
                            Text(text = "7")
                        }
                        Button(
                            onClick = {
                                userInputText += 8
                            },
                            modifier = buttonModifier,
                        ) {
                            Text(text = "8")
                        }
                        Button(
                            onClick = {
                                userInputText += 9
                            },
                        ) {
                            Text(text = "9")
                        }
                    }
                    Row (
                        modifier = keypadRowModifier,
                    ) {
                        Button(onClick = {
                            userInputText += 0
                        }) {
                            Text(text = "0")
                        }
                    }
                }
                Column {
                    Button(onClick = {
                        if(userInputText.length > 0) {
                            userInputText = userInputText.substring(0, userInputText.length-1)
                        }
                    }) {
                        Text(text = "Delete")
                    }
                    Button(onClick = {
                        userInputText = ""
                    }) {
                        Text(text = "Clear")
                    }

                    Button(onClick = {
                        if(userInputText.isNotEmpty() && quiz.verifyAnswer(userInputText.toInt())) {
                            quizLeft -= 1
                            point += 100

                            if(quizLeft < 1) {
                                //Game end
                                navController.navigate("result/$point")
                            }

                            quiz = Quiz()
                            userInputText = ""
                            timer.cancel()
                            timer.start()



                        }
                    }) {
                        Text(text = "Submit")
                    }
                    Text(text = "point: $point")
                }
            }
        }
    }
}

@Preview
@Composable
fun CalculationAppPreview() {
    CalculationApp(rememberNavController())
}
