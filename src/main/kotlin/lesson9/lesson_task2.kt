package org.example.lesson9

fun main() {

    val listOfIngredients = mutableListOf("Помидоры", "Огурцы", "Майонез")

    println("В рецепте есть базовые ингредиенты: ${listOfIngredients.joinToString()}")

    println("Желаете добавить еще?")
    val userAnswer = readln()

    if (userAnswer.equals("да", true)) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        listOfIngredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: ${listOfIngredients.joinToString()}")
    }

}