package org.example.lesson_10

fun main() {
    val humanNumber = getRandomNumber()
    println("Бросило человечество, выпало число: $humanNumber")

    val robotNumber = getRandomNumber()
    println("Бросила машина, выпало число: $robotNumber")

    if (humanNumber > robotNumber)
        println("Победило человечество")
    else if (robotNumber > humanNumber)
        println("Победила машина")
    else
        println("Победила дружба")
}

fun getRandomNumber(): Int {
    val numberRange: IntRange = 1..6
    return numberRange.random()
}