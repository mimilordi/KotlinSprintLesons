package org.example.lesson_12

fun main() {
    val weather1 = Weather()
    val weather2 = Weather()

    weather1.dayTemperature = 20
    weather1.nightTemperature = 1
    weather1.hasPrecipitation = true

    weather1.showWeather()

    weather2.dayTemperature = -7
    weather2.nightTemperature = -15
    weather2.hasPrecipitation = false

    weather2.showWeather()
}

class Weather() {
    var dayTemperature = 12
    var nightTemperature = 4
    var hasPrecipitation = false

    fun showWeather() {
        val todayPrecipitation = if (!hasPrecipitation) "Осадков не ожидается" else "Ожидаются осадки"

        println("Сегодня днем темперутра будет: $dayTemperature градусов, ночью опустится до: $nightTemperature. $todayPrecipitation ")
    }
}
