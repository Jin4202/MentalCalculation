package com.example.mentalcalculation.ui

import com.example.mentalcalculation.data.Operator
import kotlin.random.Random
import kotlin.random.nextInt

class Quiz(val x: Int = Random.nextInt(0, 99), val y: Int = Random.nextInt(0, 99)) {
    var op : Operator = Operator.PLUS

    fun verifyAnswer(answer : Int): Boolean {
        var correctAns : Int
        when(op) {
            Operator.PLUS -> correctAns = x+y
            Operator.MINUS -> correctAns = x-y
            Operator.DIVIDE -> correctAns = x/y
            Operator.MULTIPLY -> correctAns = x*y
        }

        return answer == correctAns
    }

    fun getQuizString() : String {
        return String.format("%d %s %d", x, op.getOperatorChar(), y)
    }
}