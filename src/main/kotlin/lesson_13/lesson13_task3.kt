package org.example.lesson_13

fun main() {
    val usersList = listOf(
        User("Ivan", 79999999999, null),
        User("Sasha", 79999999991, null),
        User("Oksana", 79999999992, "null"),
        User("Pasha", 79999999993, "Google"),
        User("Masha", 79999999994, "Apple"),
    )

    for (user in usersList) {
        println(user.company)
    }
}

class User(val name: String, val phone: Long, val company: String?) {

    fun showInformation() {
        val hasCompany: String = company ?: "не указано"
        println("Имя: $name, Телефон: $phone, Компания: $hasCompany")
    }

}
