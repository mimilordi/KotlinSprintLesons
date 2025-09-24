package org.example.lesson4

fun main() {

    val day = 4

    val armsAndPressExercises = day % 2 != 0
    val legsAndBackExercises = !armsAndPressExercises
    val result = """
        Упражнения для рук: $armsAndPressExercises
        Упражнения для ног: $legsAndBackExercises
        Упражнения для спины: $legsAndBackExercises
        Упражнения для пресса: $armsAndPressExercises
    """.trimIndent()

    println(result)

}