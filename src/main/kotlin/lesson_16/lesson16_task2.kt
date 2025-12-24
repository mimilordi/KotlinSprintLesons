package org.example.lesson_16

fun main() {
    val circle = Circle(15)
    circle.circumference()
    circle.circleArea()
}

private const val Pi = 3.14

class Circle(private val radius: Int) {

    fun circumference() {
        val result = 2 * Pi * radius
        println("Длина окружности: $result")
    }

    fun circleArea() {
        val area = Pi * radius * radius
        println("Площадь круга: $area")
    }
}