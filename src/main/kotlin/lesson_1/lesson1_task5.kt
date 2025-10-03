package org.example.lesson_1

fun main() {

    val flightSeconds = 6480
    val secondsInHour = 3600
    val secondsInMinute = 60

    val hours = flightSeconds / secondsInHour
    val minutes = (flightSeconds % secondsInHour) / secondsInMinute
    val remainingSeconds = flightSeconds % secondsInMinute
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, remainingSeconds)

    print(formattedTime)

}