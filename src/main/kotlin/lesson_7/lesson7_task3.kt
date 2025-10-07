package org.example.lesson_7

fun main() {

    println("Введите число")
    val userNumber: Int = readln().toInt()
    val range = 0..userNumber

    for (i in range step 2)
        println(i)

}