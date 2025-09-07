package org.example.lesson_2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTimeInMinute = 457
    val minutesInHour = 60

    val departure = departureHour * minutesInHour
    val arrivalTime = travelTimeInMinute + departure + departureMinute

    val arrivalHour = arrivalTime / minutesInHour
    val arrivalMinute = arrivalTime % minutesInHour

    println("Время прибытия $arrivalHour:$arrivalMinute")

}