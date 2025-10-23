package org.example.lesson_11_task_2

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