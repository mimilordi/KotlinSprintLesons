package org.example.lesson_6

fun main() {
    var userNumber: Int
    var maxTries = 5

    do {
        maxTries--
        println("Угадайте число от 1 до 9")
        userNumber = readln().toInt()
        if (userNumber == WIN_NUMBER) {
            println("Это была великолепная игра!")
            return
        } else if (maxTries > 0) {
            println("Попробуйте снова, осталось попыток $maxTries")
        }

    } while (maxTries > 0)
    println("Было загадано число $WIN_NUMBER")

}

const val WIN_NUMBER = 3