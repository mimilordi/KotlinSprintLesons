package org.example.lesson_12

fun main() {
    val weather = Forecast(4, -3, false)

    weather.showWeather()
}

class Forecast(val dayTemperature: Int, val nightTemperature: Int, val hasPrecipitation: Boolean) {

    fun showWeather() {
        val todayPrecipitation = if (!hasPrecipitation) "Осадков не ожидается" else "Ожидаются осадки"

        println("Сегодня днем температура будет: $dayTemperature градусов, ночью опустится до: $nightTemperature. $todayPrecipitation")
    }
}