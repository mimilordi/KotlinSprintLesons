package org.example.lesson_5

fun main() {

    val firstWinNumber = (0..42).random()
    val secondWinNumber = (0..42).random()
    val thirdWinNumber = (0..42).random()

    val winCombinations = listOf(firstWinNumber, secondWinNumber, thirdWinNumber)

    println("Введите первое число от 0 до 42: ")
    val firstUserNumber = readln().toInt()

    println("Введите второе число от 0 до 42: ")
    val secondUserNumber = readln().toInt()

    println("Введите третье число от 0 до 42: ")
    val thirdUserNumber = readln().toInt()

    val userCombination = listOf(firstUserNumber, secondUserNumber, thirdUserNumber)
    val intersection = winCombinations.intersect(userCombination)
    val intersectionLength = intersection.size

    val result = when (intersectionLength) {
        3 -> "Поздравляю, Вы угадали все числа и выиграли джекпод!"
        2 -> "Поздравляю, Вы угадали 2 числа и выиграли крупный приз!"
        1 -> "Вы угадали 1 число и получаете утешительный приз"
        0 -> "К сожалению вы не угадали ни одного числа"
        else -> "Ошибка, попробуйте заново"
    }
    println(result)
    println("Выиграшные числа $winCombinations")

}