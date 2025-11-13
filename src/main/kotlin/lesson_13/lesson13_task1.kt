package org.example.lesson_13

fun main() {
    val user = Directory("Ivan", 79999999999, null)
    user.showInformation()
}

class Directory(val name: String, val phone: Long, val company: String?) {

    fun showInformation() {
        println("Имя: $name, Телефон: $phone, Компания: $company")
    }

}

