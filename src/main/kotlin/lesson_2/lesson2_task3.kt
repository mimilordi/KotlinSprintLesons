package org.example.lesson_2

const val MINUTES_IN_HOUR = 60
const val DEPARTURE_HOUR = 9
const val DEPARTURE_MINUTE = 39
const val TRAVEL_TIME_MINUTES = 457

fun main() {

    val departure = DEPARTURE_HOUR * MINUTES_IN_HOUR
    val arrivalTime = TRAVEL_TIME_MINUTES + departure + DEPARTURE_MINUTE

    val arrivalHour = arrivalTime / MINUTES_IN_HOUR
    val arrivalMinute = arrivalTime % MINUTES_IN_HOUR

    println("Время прибытия $arrivalHour:$arrivalMinute")

}