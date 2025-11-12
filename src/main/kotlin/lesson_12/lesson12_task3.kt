package org.example.lesson_12

fun main() {
    val weather = Forecast1(293, 123, false)

    weather.showWeather()
}

class Forecast1(dayTemperature: Int, nightTemperature: Int, hasPrecipitation: Boolean) {
    val dayTemperature = (dayTemperature - TEMP_KELVIN).toInt()
    val nightTemperature = (nightTemperature - TEMP_KELVIN).toInt()
    val hasPrecipitation = hasPrecipitation

    fun showWeather() {
        val todayPrecipitation = if (!hasPrecipitation) "Осадков не ожидается" else "Ожидаются осадки"

        println("Сегодня днем темперутра будет: $dayTemperature градусов, ночью опустится до: $nightTemperature. $todayPrecipitation")
    }
}

const val TEMP_KELVIN = 273.15