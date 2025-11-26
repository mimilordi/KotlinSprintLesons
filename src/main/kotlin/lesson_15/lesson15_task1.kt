package org.example.lesson_15

fun main() {
    val carp = Carp()
    carp.swim()

    val seagull = Seagull()
    seagull.fly()

    val duck = Duck()
    duck.swim()
    duck.fly()
}

class Carp : Swim {
    override fun swim() {
        println("Карась плавает")
    }
}

class Seagull : Fly {
    override fun fly() {
        println("Чайка летает")
    }
}

class Duck : Swim, Fly {
    override fun swim() {
        println("Утка плавает")
    }

    override fun fly() {
        println("Утка летает")
    }
}

interface Swim {
    fun swim()
}

interface Fly {
    fun fly()
}
