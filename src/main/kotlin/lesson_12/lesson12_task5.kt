package org.example.lesson_12

import kotlin.random.Random

fun main() {
    var days = 30
    val daysTemperature: MutableList<Forecast1> = mutableListOf()

    while (days > 0) {
        days--
        val randomDayTemp = (210..350).random()
        val randomNightTemp = (200..300).random()
        val randomPrecision = Random.nextBoolean()
        daysTemperature.add(Forecast1(randomDayTemp, randomNightTemp, randomPrecision))
    }

    val averageDayTemp = daysTemperature.map { it.dayTemperature }.average()
    val averageNightTemp = daysTemperature.map { it.nightTemperature }.average()
    val daysHasPrecision = daysTemperature.count { it.hasPrecipitation }

    println("Средняя дневная температура: ${"%.1f".format(averageDayTemp)}")
    println("Средняя ночная температура: ${"%.1f".format(averageNightTemp)}")
    println("Количество дней с осадками: $daysHasPrecision")
}

class Forecast1(dayTemperature: Int, nightTemperature: Int, val hasPrecipitation: Boolean) {

    val dayTemperature = (dayTemperature - TEMP_KELVIN).toInt()
    val nightTemperature = (nightTemperature - TEMP_KELVIN).toInt()

}

const val TEMP_KELVIN = 273.15
