package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("Салат", "Помидоры", "Курица", "Хлеб", "Масло", "Чеснок", "Сыр")

    println("Какой ингредент хотели бы найти?")
    val searchIngredient = readln()

    val index = arrayOfIngredients.indexOf(searchIngredient)

    if (index != -1) {
        println("Ингредиент $searchIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}