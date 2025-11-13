package org.example.lesson_12

import kotlin.random.Random

fun main() {
    val weatherList = List(30) { _ ->
        Forecast1(
            dayTemperature = (210..350).random(),
            nightTemperature = (200..300).random(),
            hasPrecipitation = Random.nextBoolean()
        )
    }

    val averageDayTemp = weatherList.map { it.dayTemperature }.average()
    val averageNightTemp = weatherList.map { it.nightTemperature }.average()
    val daysHasPrecision = weatherList.count { it.hasPrecipitation }

    println("Средняя дневная температура: ${"%.1f".format(averageDayTemp)}")
    println("Средняя ночная температура: ${"%.1f".format(averageNightTemp)}")
    println("Количество дней с осадками: $daysHasPrecision")
}

class Forecast1(dayTemperature: Int, nightTemperature: Int, val hasPrecipitation: Boolean) {
    val dayTemperature = (dayTemperature - TEMP_KELVIN).toInt()
    val nightTemperature = (nightTemperature - TEMP_KELVIN).toInt()
}

const val TEMP_KELVIN = 273.15
