package org.example

fun main() {
    val temperature = Temperature(22.1)
    val amount = PrecipitationAmount(10.4)
    val server = WeatherServer()
    server.sendInformation(temperature)
    server.sendInformation(amount)
}

abstract class WeatherStationStats() {
    abstract fun getInfo(): String
}

class Temperature(val temperature: Double) : WeatherStationStats() {
    override fun getInfo(): String {
        return "Температура: $temperature"
    }
}

class PrecipitationAmount(val amount: Double) : WeatherStationStats() {
    override fun getInfo(): String {
        return "Количество осадков: $amount"
    }
}

class WeatherServer() {
    fun sendInformation(weather: WeatherStationStats) {
        println("Отправка данных")
        println(weather.getInfo())
        println()
    }
}
