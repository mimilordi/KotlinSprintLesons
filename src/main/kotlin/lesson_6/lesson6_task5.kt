package org.example.lesson_6

fun main() {

    var tries = 3
    do {

        val a: Int = (1..9).random()
        val b: Int = (1..9).random()

        val sum = a + b
        println("Введите сумму $a + $b = ")
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