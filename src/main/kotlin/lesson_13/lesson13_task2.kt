package org.example.lesson_13

fun main() {
    val user = Contact("Ivan", 79999999999, null)
    user.showInformation()
}

class Contact(val name: String, val phone: Long, val company: String?) {

    fun showInformation() {
        val hasCompany: String = company ?: "не указано"
        println("Имя: $name, Телефон: $phone, Компания: $hasCompany")
    }

}
