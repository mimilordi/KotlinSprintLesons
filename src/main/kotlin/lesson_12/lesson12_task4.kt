package org.example.lesson_12

fun main() {
    Forecast1(293, 224, true)
}

class Forecast1(dayTemperature: Int, nightTemperature: Int, hasPrecipitation: Boolean) {

    val dayTemperature = (dayTemperature - TEMP_KELVIN).toInt()
    val nightTemperature = (nightTemperature - TEMP_KELVIN).toInt()

    init {
        val todayPrecipitation = if (!hasPrecipitation) "Осадков не ожидается" else "Ожидаются осадки"
        print("Сегодня днем темперутра будет: ${this.dayTemperature} градусов, ночью опустится до: ${this.nightTemperature}. $todayPrecipitation")
    }
}

const val TEMP_KELVIN = 273.15
