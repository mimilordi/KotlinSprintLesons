package org.example.lesson_12

fun main() {
    val weather = Forecast(4, -3, false)

    weather.showWeather()
}

class Forecast(var dayTemperature: Int, var nightTemperature: Int, var hasPrecipitation: Boolean) {

    fun showWeather() {
        val todayPrecipitation = if (!hasPrecipitation) "Осадков не ожидается" else "Ожидаются осадки"

        println("Сегодня днем темперутра будет: $dayTemperature градусов, ночью опустится до: $nightTemperature. $todayPrecipitation")
    }
}