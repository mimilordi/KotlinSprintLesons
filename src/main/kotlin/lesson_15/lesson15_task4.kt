package org.example.lesson_15

fun main() {
    val guitar = Instrument("Гитара", 3)
    val strings = Components("Струны для гитары", 7)

    guitar.showInfo()
    guitar.searchComponent()

    strings.showInfo()
}

abstract class Goods() {
    abstract val name: String
    abstract val count: Int
    abstract fun showInfo()
}

class Instrument(
    override val name: String,
    override val count: Int,
    ) : Goods(), Search {
    override fun showInfo() {
        println("Товар: \"$name\", оставшееся количество $count шт.")
    }

    override fun searchComponent() {
        super.searchComponent()
    }
}

class Components(
    override val name: String,
    override val count: Int,
    ) : Goods() {
    override fun showInfo() {
        println("Комплектующее: \"$name\", оставшееся количество $count шт.")
    }
}

interface Search {
    fun searchComponent() {
        println("Выполняется поиск")
    }
}