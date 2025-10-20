package org.example.lesson_9

fun main() {
    val ingredientsList = mutableSetOf<String>()
    val ingredientsQuantity = 5

    do {
        println("Введи название ингредиента:")
        val ingredient = readln().lowercase()

        if (!ingredientsList.add(ingredient)) println("Такой игредиет уже есть!")

    } while (ingredientsList.size != ingredientsQuantity)

    val sortedIngredientList = ingredientsList.sorted()
    println("Список игредиентов: ${sortedIngredientList.joinToString().replaceFirstChar { it.uppercase() }}")
}
