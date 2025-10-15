package org.example.lesson_8

fun main() {

    val arrayOfIngredients = arrayOf("Салат", "Помидоры", "Курица", "Хлеб", "Масло", "Чеснок", "Сыр")
    println("Список ингредиентов: " + arrayOfIngredients.joinToString())

    println("Какой ингредиент хотели бы заменить?")
    val userIngredient = readln()

    val index = arrayOfIngredients.indexOf(userIngredient)

    if (index != -1) {
        println("Введите название ингредиента, который хотели бы добавить: ")
        val newIngredient = readln()
        arrayOfIngredients[index] = newIngredient
        println("Готово! Вы сохранили следующий список: " + arrayOfIngredients.joinToString())
    } else {
        println("Данного ингредиента нет в списке")
    }
}