package org.example.lesson_6

fun main() {

    println("Введите количество секунд: ")
    val seconds = readln().toInt()
    var sec = seconds

    while (sec > 0) {
        println("${sec--}")
        Thread.sleep(1000)
    }

    println("Прошло ${seconds} секунд")

}