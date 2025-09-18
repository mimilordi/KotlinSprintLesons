package org.example.lesson_2

const val PERCENT = 100

fun main() {

    val crystalOre = 7
    val metalOre = 11
    val bonusPercent = 20

    val bonusCristalOre = crystalOre * bonusPercent / PERCENT
    val bonusMetalOre = metalOre * bonusPercent / PERCENT
    println("Кристаллическая руда: $bonusCristalOre")
    println("Железная руда: $bonusMetalOre")

}