package org.example.lesson_5

import java.time.LocalDate

fun main() {

    println("Введите год рождения: ")

    val currentYear = LocalDate.now().year
    val userBornYear = readln().toInt()
    val userAge = currentYear - userBornYear

    if (userAge >= AGE_OF_MAJORITY)
        println("Show special content")
    else
        println("Back to main screen")

}

const val AGE_OF_MAJORITY = 18