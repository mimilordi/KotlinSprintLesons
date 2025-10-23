package org.example.lesson_11_task_1

fun main() {
    val firstUser = User(
        userId = 456875,
        login = "vally",
        password = "robot-robot",
        email = "bortyk32@gmail.com"
    )

    val secondUser = User(
        userId = 654234,
        login = "user",
        password = "admin",
        email = "kosmopolis@gmail.com"
    )

    firstUser.printUserInfo()
    secondUser.printUserInfo()
}