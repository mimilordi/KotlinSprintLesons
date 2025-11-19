package org.example.lesson_13

fun main() {
    val phoneBook = mutableListOf<Directory>()

    try {
        println("Введите имя:")
        val name = readln()

        println("Введите телефон:")
        val phone = readln().toLong()

        println("Введите компанию:")
        val companyInput = readln()
        val company = companyInput.ifEmpty { null }

        val client = Directory(name, phone, company)
        phoneBook.add(client)
    } catch (e: Exception) {
        println(e::class.simpleName)
    }
    println("Контакты:")
    phoneBook.forEach { it.showInformation() }
}

class Directory(val name: String, val phone: Long, val company: String?) {

    fun showInformation() {
        val hasCompany: String = company ?: "не указано"
        println("Имя: $name, Телефон: $phone, Компания: $hasCompany")
    }

}