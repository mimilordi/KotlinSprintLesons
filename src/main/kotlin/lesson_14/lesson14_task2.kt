package org.example.lesson_14

fun main() {
    val liner = Ship()
    liner.showShipInformation()
    println()

    val cargoShip = Freighter()
    cargoShip.showShipInformation()
    println()

    val icebreakerShip = IcebreakerShip()
    icebreakerShip.showShipInformation()
    println()
}

open class Ship(
    open val name: String = "lucky",
    open val speed: Int = 50,
    open val passengers: Int = 3000,
) {

    open fun loadCargo() {
        println("Способ погрузки: горизонтальный трап со шкафута")
    }

    open fun showShipInformation() {
        println("Корабль $name развивает скорость до $speed и вмещает до $passengers пассажиров")
        loadCargo()
    }

}

class Freighter(
    override val name: String = "heavy",
    override val speed: Int = 20,
    override val passengers: Int = 500,
    val carrying: Int = 30
) : Ship(name, speed, passengers) {

    override fun loadCargo() {
        println("Способ погрузки: погрузочный кран")
    }

    override fun showShipInformation() {
        println("Корабль $name развивает скорость до $speed, вмещает до $passengers пассажиров, грузоподъемность $carrying т.")
        loadCargo()
    }

}

class IcebreakerShip(
    override val name: String = "sharp",
    override val speed: Int = 9,
    override val passengers: Int = 200,
    val hasIceBreaker: Boolean = true,
) : Ship(name, speed, passengers) {

    override fun loadCargo() {
        println("Способ погрузки: ворота со стороны кормы")
    }

    override fun showShipInformation() {
        println("Корабль $name развивает скорость до $speed, вмещает до $passengers пассажиров и может колоть лед $hasIceBreaker")
        loadCargo()
    }

}