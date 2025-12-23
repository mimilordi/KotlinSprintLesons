package org.example.lesson_15

fun main() {
    val car = Car()
    val truck = Truck()

    car.loadingPassengers(3)
    car.move()
    car.unloadingPassengers()

    car.loadingPassengers(2)
    car.move()
    car.unloadingPassengers()

    truck.loadingPassengers(1)
    truck.loadingCargo(2)
    truck.move()
    truck.unloadingPassengers()
    truck.unloadingCargo()
}

abstract class Transport() {
    abstract fun move()
}

class Truck(
    override val maxPassenger: Int = 1,
    override val maxCargo: Int = 2,
) : Transport(), Passenger, Cargo {

    override var currentPassenger: Int = 0
    override var currentCargo: Int = 0

    override fun move() {
        println("Грузовая машина отправилась")
    }

}

class Car(
    override val maxPassenger: Int = 3,
) : Transport(), Passenger {

    override var currentPassenger = 0

    override fun move() {
        println("Легковая машина отправилась")
    }
}

interface Passenger {
    val maxPassenger: Int
    var currentPassenger: Int

    fun loadingPassengers(count: Int) {
        if (count > maxPassenger) {
            println("Нельзя перевозить $count человек, максимум $maxPassenger ")
        } else {
            currentPassenger = count
            println("Загружено $count человек")
        }
    }

    fun unloadingPassengers() {
        println("Выгрузка пассажиров в количестве $currentPassenger человек")
        currentPassenger = 0
    }
}

interface Cargo {
    val maxCargo: Int
    var currentCargo: Int

    fun loadingCargo(amount: Int) {
        if (amount > maxCargo) {
            println("Нельзя перевозить $amount тонн груза, максимум $maxCargo ")
        } else {
            currentCargo = amount
            println("Загрузка $currentCargo тонн груза")
        }
    }

    fun unloadingCargo() {
        println("Выгрузка груза")
        currentCargo = 0
    }
}