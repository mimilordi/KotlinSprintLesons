package org.example.lesson4

fun main() {

    val day = 5

    val armsAndPressExercises = day % 2 != 0
    val result = """
        Упражнения для рук: $armsAndPressExercises
        Упражнения для ног: ${!armsAndPressExercises}
        Упражнения для спины: ${!armsAndPressExercises}
        Упражнения для пресса: $armsAndPressExercises
    """.trimIndent()

    println(result)

}