package org.example.lesson_9

fun main() {
    val quantityOnePortion = listOf(2, 50, 15)

    println("Сколько порций хотели бы приготовить?")
    val portions = readln().toInt()

    val quantityUserPortion = quantityOnePortion.map {
        it * portions
    }

    println(
        "На $portions порций вам понадобится: " +
                "Яиц - ${quantityUserPortion[0]}, " +
                "молока - ${quantityUserPortion[1]}, " +
                "сливочного масла - ${quantityUserPortion[2]}"
    )
}