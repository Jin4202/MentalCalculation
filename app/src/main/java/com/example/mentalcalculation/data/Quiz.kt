package com.example.mentalcalculation.data

import kotlin.random.Random

class Quiz(var levelState: LevelState) {
    val op = levelState.pickOperator()
    val max = levelState.numberLevel
    var y: Int = Random.nextInt(0, max)
    var x: Int = when(op) {
        Operator.MINUS -> {
            Random.nextInt(y, max)
        }
        Operator.DIVIDE -> {
            Random.nextInt(0, max)*y
        }
        else -> {
            Random.nextInt(0, max)
        }
    }
    fun verifyAnswer(answer : Int): Boolean {
        val correctAns : Int
        when(op) {
            Operator.PLUS -> correctAns = x+y
            Operator.MINUS -> correctAns = x-y
            Operator.DIVIDE -> correctAns = x/y
            Operator.MULTIPLY -> correctAns = x*y
        }

        return answer == correctAns
    }

    fun getQuizString(): String {
        return String.format("%d %s %d", x, op.getOperatorChar(), y)
    }
}