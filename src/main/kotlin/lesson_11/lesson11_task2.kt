package lesson_11

fun main() {
    val personalInfo = User2(
        userId = 342543,
        login = "vivi",
        password = "test-123",
        email = "kolpak@gmail.com",
    )

    personalInfo.getBio()
    personalInfo.changePassword()

    personalInfo.printUserInfo()
}

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