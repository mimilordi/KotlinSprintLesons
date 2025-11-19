package org.example.lesson_13

fun main() {
    val phoneBook = mutableListOf<Client>()

    println("Введите имя:")
    val name = readln()

    println("Введите телефон:")
    val phone = readln().toLongOrNull()

    if (phone == null) {
        println("Номер телефона не указан")
        return
    }

    println("Введите компанию:")
    val companyInput = readln()
    val company = companyInput.ifEmpty { null }

    val client = Client(name, phone, company)
    phoneBook.add(client)

    println("Контакты:")
    phoneBook.forEach { it.showInformation() }
}

class Client(val name: String, val phone: Long, val company: String?) {

    fun showInformation() {
        val hasCompany: String = company ?: "не указано"
        println("Имя: $name, Телефон: $phone, Компания: $hasCompany")
    }

}