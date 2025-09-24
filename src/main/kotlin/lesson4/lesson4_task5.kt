package org.example.lesson4

fun main() {

    println("Введите численность экипажа(Число): ")
    val crew: Int = readln()!!.toInt()

    println("Есть ли повреждения корпуса(Boolean)?: ")
    val shipIsDamaged: Boolean = readln()!!.toBoolean()
    println(shipIsDamaged)

    println("Количество ящиков с провизией на борту(Число)?: ")
    val provisionBoxes = readln()!!.toInt()

    println("Метеоусловия благоприятные(Boolean)?: ")
    val weatherСondition = readln()!!.toBoolean()


    val cases =
        (!shipIsDamaged && (crew in 55..70) && (provisionBoxes > 50)) || (shipIsDamaged && crew == 70 && provisionBoxes > 50 && weatherСondition)
    println("Корабль может приступить к плаванию: $cases")

}