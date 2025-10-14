package org.example.lesson_9

fun main() {
    val ingredients = listOf("Картофель", "Свекла", "Чеснок", "Колбаса", "Огурец")

    println("В рецепте есть следующие ингредиенты: ")

    ingredients.forEach { println(it) }
}