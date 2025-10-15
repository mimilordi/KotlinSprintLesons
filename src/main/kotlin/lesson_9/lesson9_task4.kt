package org.example.lesson_9

fun main() {
    println("Введите названия 5-ти ингредиентов: ")
    val ingredients = readln()

    val ingredientsList = ingredients.split(", ")
    val sortedIngredients = ingredientsList.sortedBy { it.lowercase() }
    println(sortedIngredients.joinToString())
}