package org.example.lesson_16

fun main() {
    val user = User("vaiv")
    println(user.checkPassword("abc123"))
}

class User(val userName: String, private val userPassword: String = "abc123") {

    fun checkPassword(password: String): Boolean {
        return password == userPassword
    }

}

