package org.example.lesson_5

fun main() {

    val firstWinNumber = 29
    val secondWinNumber = 13

    println("Введите первое число: ")
    val firstUserNumber = readln().toInt()

    println("Введите второе число: ")
    val secondUserNumber = readln().toInt()

    val winCase =
        (firstUserNumber == firstWinNumber && secondUserNumber == secondWinNumber) || (firstUserNumber == secondWinNumber && secondUserNumber == firstWinNumber)

    val oneMatch =
        firstUserNumber == firstWinNumber || secondUserNumber == secondWinNumber || firstUserNumber == secondWinNumber || secondUserNumber == firstWinNumber

    if (winCase) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (oneMatch) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
        println("Выигрышные числа $firstWinNumber и $secondWinNumber")
    }

}