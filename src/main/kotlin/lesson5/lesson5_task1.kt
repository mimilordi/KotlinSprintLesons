package org.example.lesson5

fun main() {

    val a = 34
    val b = 23
    val sum = a + b

    println("Необходимо решить задачу: $a + $b =")

    val result = readln().toInt()

    if (result == sum)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")

}