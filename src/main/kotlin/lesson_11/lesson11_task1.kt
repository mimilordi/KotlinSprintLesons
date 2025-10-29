package lesson_11

fun main() {
    val firstUser = User1(
        userId = 456875,
        login = "vally",
        password = "robot-robot",
        email = "bortyk32@gmail.com"
    )

    val secondUser = User1(
        userId = 654234,
        login = "user",
        password = "admin",
        email = "kosmopolis@gmail.com"
    )

    firstUser.printUserInfo()
    secondUser.printUserInfo()
}

class User1(
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