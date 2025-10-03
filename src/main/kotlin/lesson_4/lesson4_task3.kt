package org.example.lesson4

fun main() {

    val weatherIsSunny = true
    val awningIsOpen = true
    val airHumidity = 20
    val season = "зима"
    val favorableConditionsBean: Boolean = weatherIsSunny && awningIsOpen && airHumidity == 20 && season != "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditionsBean")

}