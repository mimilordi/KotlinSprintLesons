package org.example.lesson4

fun main() {

    println("Введите численность экипажа(Число): ")
    val crew: Int = readln().toInt()

    println("Есть ли повреждения корпуса(Boolean)?: ")
    val shipIsDamaged: Boolean = readln().toBoolean()
    println(shipIsDamaged)

    println("Количество ящиков с провизией на борту(Число)?: ")
    val provisionBoxes = readln().toInt()

    println("Метеоусловия благоприятные(Boolean)?: ")
    val weatherСondition = readln().toBoolean()
    val hasEnoughProvision: Boolean = provisionBoxes > MIN_PROVISION_BOXES

    val cases =
        (shipIsDamaged != SHIP_IS_HEALTHY && (crew in MIN_CREW..MAX_CREW) && hasEnoughProvision) || (shipIsDamaged == SHIP_IS_HEALTHY && crew == MAX_CREW && hasEnoughProvision && weatherСondition == WEATHER_IS_GOOD)
    println("Корабль может приступить к плаванию: $cases")

}

const val MIN_CREW = 55
const val MAX_CREW = 70
const val MIN_PROVISION_BOXES = 50
const val SHIP_IS_HEALTHY = true
const val WEATHER_IS_GOOD = true