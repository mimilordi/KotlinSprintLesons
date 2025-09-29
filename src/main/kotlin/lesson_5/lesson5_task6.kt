package org.example.lesson_5

import kotlin.math.pow
import kotlin.math.round

fun main() {

    println("Введите Ваш вес в килограммах: ")
    val weight = readln().toDouble()

    println("Введите ваш рос в сантиметрах")
    val growth = readln().toDouble()

    val growthInMeter = growth / SM_IN_METER
    val imt: Double = weight / growthInMeter.pow(2)
    val roundImt = round(imt * 10) / 10
    println(roundImt)

    val category = when {
        roundImt < MIN_IMT -> "Недостаточная масса тела"
        roundImt < MEDIUM_IMT -> "Нормальная масса тела"
        roundImt < MAX_IMT -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println("Категория веса: $category")

}

const val SM_IN_METER = 100
const val MAX_IMT = 30
const val MEDIUM_IMT = 25
const val MIN_IMT = 18.5