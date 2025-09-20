package org.example.lesson_2

const val MINUTES_IN_HOUR = 60

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinutes = 457

    val departure = departureHour * MINUTES_IN_HOUR
    val arrivalTime = travelTimeMinutes + departure + departureMinute

    val arrivalHour = arrivalTime / MINUTES_IN_HOUR
    val arrivalMinute = arrivalTime % MINUTES_IN_HOUR

    println("Время прибытия $arrivalHour:$arrivalMinute")

}