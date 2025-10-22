package org.example.lesson_10

fun main() {
    var humanResult = 0
    var counter = 0
    var answer: String

    do {
        counter++
        val result = game()
        if (result) humanResult++

        println("Хотите бросить кости еще раз? Введите 'Да' или 'Нет'")
        answer = readln().lowercase()
    } while (answer != "нет")
    println(
        "Сыграно матчей: $counter " +
                "Вы выиграли $humanResult раз"
    )
}

fun game(): Boolean {
    var humanWin = false
    val humanNumber = randomNumber()
    println("Вам выпало число: $humanNumber")

    val robotNumber = randomNumber()
    println("Бросила машина, выпало число: $robotNumber")

    if (humanNumber > robotNumber) {
        humanWin = true
        println("Вы победили")
    } else if (robotNumber > humanNumber) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }
    return humanWin
}

fun randomNumber(): Int = (1..6).random()
