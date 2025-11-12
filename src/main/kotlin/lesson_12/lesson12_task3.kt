package org.example.lesson_12

fun main() {
    val weather = Forecast2(293, 123, false)

    weather.showWeather()
}

class Forecast2(dayTemperature: Int, nightTemperature: Int, hasPrecipitation: Boolean) {
    val dayTemperature = (dayTemperature - TEMP_KELVIN2).toInt()
    val nightTemperature = (nightTemperature - TEMP_KELVIN2).toInt()
    val hasPrecipitation = hasPrecipitation

    fun showWeather() {
        val todayPrecipitation = if (!hasPrecipitation) "Осадков не ожидается" else "Ожидаются осадки"

        println("Сегодня днем темперутра будет: $dayTemperature градусов, ночью опустится до: $nightTemperature. $todayPrecipitation")
    }
}

const val TEMP_KELVIN2 = 273.15