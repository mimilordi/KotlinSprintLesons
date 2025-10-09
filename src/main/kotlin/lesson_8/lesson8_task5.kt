package org.example.lesson_8

fun main() {

    println("Сколько игредиентов будет в списке?")
    val amountOfIngredients = readln().toInt()

    val arrayOfIngredients = Array(amountOfIngredients) { "" }

    for (i in arrayOfIngredients.indices) {
        println("Введите название ингредиента: ")
        val newIngredient = readln()
        arrayOfIngredients[i] = newIngredient
    }
    println(arrayOfIngredients.joinToString())

}