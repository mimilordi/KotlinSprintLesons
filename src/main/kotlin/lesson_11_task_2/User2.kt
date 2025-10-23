package org.example.lesson_11_task_2

class User2(
    val userId: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null
) {

    fun printUserInfo() {
        println(
            """
                Данные пользователя: 
                Id: $userId
                Логин: $login
                Пароль: $password
                Почта: $email
                Био: $bio
        """.trimIndent()
        )
    }

    fun getBio() {
        println("Введите ваш пол: ")
        bio = readln()
    }

    fun changePassword() {
        println("Введите текущий пароль: ")
        val userPassword = readln()

        if (userPassword == password) {
            println("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Ваш пароль изменен")
        } else {
            println("Вы ввели неверный пароль!")
        }
    }
}