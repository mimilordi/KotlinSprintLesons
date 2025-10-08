package org.example.lesson_7

fun main() {

    val rangeForSmsCode = 1000..9999

    do {
        val code = rangeForSmsCode.random()
        println("Ваш код авторизации: $code")
        println("Введите код авторизации: ")
        val userCode = readln().toInt()
    } while (code != userCode)
    println("Добро пожаловать!")
}