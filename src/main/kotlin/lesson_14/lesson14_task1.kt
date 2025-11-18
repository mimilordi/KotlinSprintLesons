package org.example.lesson_14

fun main() {
    val liner = Liner("lucky", 50, 3000)
    liner.showShipInformation()

    val cargoShip = Cargo("heavy", 20, 500, 30)
    cargoShip.showShipInformation()

    val icebreakerShip = Icebreaker("sharp", 9, 200)
    icebreakerShip.showShipInformation()
}

open class Liner(
    val name: String,
    val speed: Int,
    val passengers: Int,
) {

    open fun showShipInformation() {
        println("Корабль $name развивает скорость до $speed и вмещает до $passengers пассажиров")
    }

}

class Cargo(
    name: String,
    speed: Int,
    passengers: Int,
    val carrying: Int
) : Liner(name, speed, passengers) {

    override fun showShipInformation() {
        println("Корабль $name развивает скорость до $speed, вмещает до $passengers пассажиров, грузоподъемность $carrying т.")
    }

}

class Icebreaker(
    name: String,
    speed: Int,
    passengers: Int,
    val hasIceBreaker: Boolean = true,
) : Liner(name, speed, passengers) {

    override fun showShipInformation() {
        println("Корабль $name развивает скорость до $speed, вмещает до $passengers пассажиров и может колоть лед $hasIceBreaker")
    }

}