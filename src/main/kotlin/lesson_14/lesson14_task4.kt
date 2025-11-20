package org.example.lesson_14

fun main() {
    val moon1 = Moon("Moon", hasAtmosphere = false, canLand = true)
    val moon2 = Moon("Mars", hasAtmosphere = false, canLand = false)

    val planet1 = Planet("Earth", hasAtmosphere = true, canLand = true)

    planet1.planetMoons.add(moon1)
    planet1.planetMoons.add(moon2)

    planet1.description()
    planet1.printPlanetMoons()
}

abstract class Celestial(
    val name: String,
    val hasAtmosphere: Boolean,
    val canLand: Boolean,
) {

    open fun description() {
        println(if (hasAtmosphere) "Атмосфера присутсвует" else "Атмосфера отсутсвует")
        println(if (canLand) "Возможна высадка" else "Высадка невозможна")
    }

}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    canLand: Boolean,
) : Celestial(name, hasAtmosphere, canLand) {

    val planetMoons: MutableList<Moon> = mutableListOf()

    override fun description() {
        println("Название планеты: $name")
        super.description()
        println()
    }

    fun printPlanetMoons() {
        println("Список спутников планеты $name:")
        planetMoons.forEach {
            it.description()
            println()
        }
    }
}

class Moon(
    name: String,
    hasAtmosphere: Boolean,
    canLand: Boolean,
) : Celestial(name, hasAtmosphere, canLand) {

    override fun description() {
        println("Название спутника: $name")
        super.description()
    }

}