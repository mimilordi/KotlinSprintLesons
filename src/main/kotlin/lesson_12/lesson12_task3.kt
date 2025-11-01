package org.example.lesson_12

import kotlin.math.round

fun main() {
    val weather = Forecast1()

    weather.showWeather()
}

class Forecast1() {
    var dayTemperature: Int = 300
    var nightTemperature: Int = 250
    var hasPrecipitation = false

    fun showWeather() {
        val celsiusDayTemp = round(dayTemperature - TEMP_KELVIN)
        val celsiusNightTemp = round(nightTemperature - TEMP_KELVIN)
        val todayPrecipitation = if (!hasPrecipitation) "Осадков не ожидается" else "Ожидаются осадки"

        println("Сегодня днем темперутра будет: $celsiusDayTemp градусов, ночью опустится до: $celsiusNightTemp. $todayPrecipitation")
    }
}

const val TEMP_KELVIN = 273.15