package org.example.lesson1_task5

fun main() {

    val seconds = 6480
    val hour = seconds / 3600
    val minute = (seconds - 3600) / 60
    val second = (seconds - 3600) - minute * 60

    println("$hour:$minute:$second")

}