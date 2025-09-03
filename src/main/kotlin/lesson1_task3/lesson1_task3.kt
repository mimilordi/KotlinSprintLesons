package org.example.lesson1_task3

fun main () {

    val yearOfFlight = 1961
    var hour = 9
    var minute = 7
//    var boardingHour = 10
//    var boardingMinute = 55

    println(yearOfFlight)
    println(hour.toString().padStart(2, '0'))
    println(minute.toString().padStart(2, '0'))

    hour = 10
    minute = 55

    print(hour)
    print(":")
    print(minute)

}