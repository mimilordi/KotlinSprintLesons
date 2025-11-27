package org.example.lesson_15

fun main() {
    val user = User("Cat")
    val admin = Admin("Dog")

    user.sendMessage("Привет!")
    user.sendMessage("Поговорим о политике?")

    admin.sendMessage("Никаких разговоров о политике!")

    user.sendMessage("Но я за этим сюда пришел")
    admin.deleteMessage()
    admin.deleteUser()
}

abstract class Persons() {
    abstract val role: String
    abstract val userName: String
    abstract fun sendMessage(text: String)
}

class Admin(override val userName: String) : Persons(), Methods {
    override val role = "Admin"

    override fun sendMessage(text: String) {
        println("$role $userName отправил сообщение: $text")
    }
}

class User(override val userName: String) : Persons() {
    override val role = "User"

    override fun sendMessage(text: String) {
        println("$userName отправил сообщение: $text")
    }
}

interface Methods {
    fun deleteMessage() {
        println("\nАдминистратор удалил сообщение!")
    }

    fun deleteUser() {
        println("\nАдминистратор удалил пользователя!")
    }
}