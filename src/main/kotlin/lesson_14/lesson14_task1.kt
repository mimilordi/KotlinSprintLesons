package org.example.lesson_14

fun main() {
    val liner = Liner()
    liner.showShipInformation()

    val cargoShip = Cargo()
    cargoShip.showShipInformation()

    val icebreakerShip = Icebreaker()
    icebreakerShip.showShipInformation()
}

open class Liner(
    open val name: String = "lucky",
    open val speed: Int = 50,
    open val passengers: Int = 3000,
) {

    open fun showShipInformation() {
        println("Корабль $name развивает скорость до $speed и вмещает до $passengers пассажиров")
    }

}

class Cargo(
    override val name: String = "heavy",
    override val speed: Int = 20,
    override val passengers: Int = 500,
    val carrying: Int = 30
) : Liner(name, speed, passengers) {

    override fun showShipInformation() {
        println("Корабль $name развивает скорость до $speed, вмещает до $passengers пассажиров, грузоподъемность $carrying т.")
    }

}

class Icebreaker(
    override val name: String = "sharp",
    override val speed: Int = 9,
    override val passengers: Int = 200,
    val hasIceBreaker: Boolean = true,
) : Liner(name, speed, passengers) {

    override fun showShipInformation() {
        println("Корабль $name развивает скорость до $speed, вмещает до $passengers пассажиров и может колоть лед $hasIceBreaker")
    }

}