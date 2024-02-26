package com.example.mentalcalculation.data

import kotlinx.serialization.Serializable
import kotlin.random.Random

@Serializable
data class LevelState(val operatorList: List<Boolean>, val numberLevel: Int, val timeLevel: Int) {

    fun pickOperator():Operator {
        val opList = ArrayList<Operator>()
        if (operatorList[0]) {opList.add(Operator.PLUS)}
        if (operatorList[1]) {opList.add(Operator.MINUS)}
        if (operatorList[2]) {opList.add(Operator.MULTIPLY)}
        if (operatorList[3]) {opList.add(Operator.DIVIDE)}
        return opList[Random.nextInt(0, opList.size-1)]
    }
}
