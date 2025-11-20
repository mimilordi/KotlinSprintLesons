package org.example.lesson_14

fun main() {

    val figureList: MutableList<Figure> = mutableListOf()

    figureList.add(Circle("черный", 12))
    figureList.add(Circle("белый", 20))

    figureList.add(Rectangle("черный", 5.2, 11.6))
    figureList.add(Rectangle("белый", 13.3, 26.9))

    val blackPerimeterSum = figureList.filter { it.color == "черный" }.sumOf { it.perimeter() }
    println("Cумма периметров всех черных фигур $blackPerimeterSum")

    val whiteAreaSum = figureList.filter { it.color == "белый" }.sumOf { it.perimeter() }
    println("Cумма площадей всех белых фигур $whiteAreaSum")

}

abstract class Figure(
    val color: String,
) {

    abstract fun area(): Double

    abstract fun perimeter(): Double

}


class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {

    override fun area(): Double {
        return PI * radius * radius
    }

    override fun perimeter(): Double {
        return 2 * PI * radius
    }

}

class Rectangle(
    color: String,
    val height: Double,
    val width: Double,
) : Figure(color) {

    override fun area(): Double {
        return height * width
    }

    override fun perimeter(): Double {
        return 2 * (height + width)
    }

}

const val PI = 3.14