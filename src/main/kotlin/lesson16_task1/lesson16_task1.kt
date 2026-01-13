package org.example.lesson16_task1

fun main() {
    val number = Cube()
    number.printRandomNumber()
}

class Cube(private val randomNumber: Int = (1..6).random()) {
    fun printRandomNumber() {
        println(randomNumber)
    }
}