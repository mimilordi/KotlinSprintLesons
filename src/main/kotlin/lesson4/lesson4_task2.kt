package org.example.lesson4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {

    val firstCargoWeight = 20
    val secondCargoWeight = 50
    val secondCargoVolume = 80
    val thirdCargoVolume = 100

    println("Груз с весом $firstCargoWeight кг соответствует категории 'Average': ${firstCargoWeight > MIN_WEIGHT && firstCargoWeight <= MAX_WEIGHT}")
    println("Груз с весом $secondCargoWeight кг и объемом $secondCargoVolume л соответствует категории 'Average': ${(secondCargoWeight > MIN_WEIGHT && secondCargoWeight <= MAX_WEIGHT) || secondCargoVolume > MAX_VOLUME} ")
    println("Груз собъемом $thirdCargoVolume л соответствует категории 'Average': ${thirdCargoVolume > MAX_VOLUME}")

}