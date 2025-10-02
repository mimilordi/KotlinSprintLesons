package org.example.lesson_5

import kotlin.math.round

fun main() {

    println("Расстояние поездки (в километрах): ")
    val distanceKm = readln().toFloat()

    println("Расход топлива на 100 км (в литрах): ")
    val literOnKm = readln().toFloat()

    println("Текущую цену за литр топлива.")
    val priceForLiter = readln().toFloat()

    val gasoline: Float = (distanceKm * literOnKm) / PER_100_KM

    val fullTripPrice: Float = gasoline * priceForLiter
    val roundFullTripPrice: Float = round(fullTripPrice * 100) / 100
    println("Топлива необходимо $gasoline литров.\nИтоговая стоимость поездки $roundFullTripPrice рублей")

}

const val PER_100_KM = 100