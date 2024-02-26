package com.example.mentalcalculation.data

import kotlin.random.Random

class Quiz(val x: Int = Random.nextInt(0, 99), val y: Int = Random.nextInt(1, 99),  var op : Operator = Operator.PLUS) {

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

    fun getQuizString() : String {
        return String.format("%d %s %d", x, op.getOperatorChar(), y)
    }
}