package org.example.lesson_9

fun main() {

    val ingredientsList = listOf("Картофель", "Свекла", "Чеснок", "Колбаса", "Огурец")

    println("В рецепте есть следующие ингредиенты: ")

    ingredientsList.forEach { println(it) }

}