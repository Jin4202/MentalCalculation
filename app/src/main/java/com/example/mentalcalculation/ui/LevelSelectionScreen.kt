package com.example.mentalcalculation.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mentalcalculation.data.Operator


data class LevelState(val operatorList: List<Operator>, val numberLevel: Int, val timeLevel: Int)

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
                Text(text = "x 0.4p")
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(text = "Numbers")
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "~10")
                }
                Button(onClick = { /*TODO*/ }) {
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
                Text(text = "x 0.1p")
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Box(modifier = Modifier.fillMaxWidth(0.3f)) {
                    Text(
                        text = ""
                    )
                }

                Button(
                    onClick = { /*TODO*/ }
                ) {
                    Text(text = "Start the quiz")
                }

                Box(modifier = Modifier.fillMaxWidth(0.3f)) {
                    Text(
                        text = "x 1"
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun LevelSelectionScreenPreview() {
    LevelSelectionScreen()
}