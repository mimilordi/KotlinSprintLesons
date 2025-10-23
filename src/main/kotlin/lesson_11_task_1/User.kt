package org.example.lesson_11_task_1

class User(
    val userId: Int,
    val login: String,
    val password: String,
    val email: String,
) {
    fun printUserInfo() {
        println(
            """
                Данные пользователя: 
                Id: $userId
                Логин: $login
                Пароль: $password
                Почта: $email
        """.trimIndent()
        )
    }
}