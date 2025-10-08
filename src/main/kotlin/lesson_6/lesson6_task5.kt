package org.example.lesson_6

fun main() {

    var tries = 3
    do {

        val firstNumber: Int = (MIN_VALUE..MAX_VALUE).random()
        val secondNumber: Int = (MIN_VALUE..MAX_VALUE).random()

        val sum = firstNumber + secondNumber
        println("Введите сумму $firstNumber + $secondNumber = ")
        val answer = readln().toInt()
        tries--
        if (answer == sum) {
            println("Добро пожаловать!")
            return
        } else if (tries > 0) {
            println("Попрбуй еще раз, осталось попыток: $tries")
        } else
            println("Доступ запрещен")

    } while (tries > 0)

}

const val MIN_VALUE = 1
const val MAX_VALUE = 9