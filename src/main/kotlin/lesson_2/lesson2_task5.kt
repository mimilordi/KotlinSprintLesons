package org.example.lesson_2

import kotlin.math.pow

const val PERCENT_BASE = 100

fun main() {

    val amountOfMoney = 70000
    val term = 20
    val percent = 16.7

    val result = amountOfMoney * ((1 + percent / PERCENT_BASE).pow(term))
    println(result)
    println("%.3f".format(result))

}
