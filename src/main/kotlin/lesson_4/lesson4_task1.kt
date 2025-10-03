package org.example.lesson4

const val TABLES_COUNT = 13

fun main() {

    val orderedTablesToday = 13
    val orderedTablesTomorrow = 9

    println("Доступность столиков на сегодня: ${orderedTablesToday < TABLES_COUNT}")
    println("Доступность столиков на завтра: ${orderedTablesTomorrow < TABLES_COUNT}")

}