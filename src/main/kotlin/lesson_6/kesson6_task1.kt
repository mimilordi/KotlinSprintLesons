package org.example.lesson_6

fun main() {

    println("Придумайте имя пользователя: ")
    val newUserName = readln()

    println("Придумайте пароль: ")
    val newPassword = readln()
    println(newPassword)

    do {
        println("Введите логин: ")
        val userName = readln()

        println("Введите пароль: ")
        val password = readln()
    } while (newUserName != userName || newPassword != password)

    println("Авторизация прошла успешно")

}