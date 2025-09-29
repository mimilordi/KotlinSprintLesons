package org.example.lesson_5

fun main() {

    println("Пожалуйста, введите имя пользователя: ")
    val userLogin = readln()

    if (userLogin == LOGIN) {
        println("Введите пароль: ")
        val userPassword = readln()
        if (userPassword == PASSWORD) {
            println(
                "Ваши данные проверены, и о, чудо, они верны...\n" +
                        "Пользователь \"$userLogin\", вам разрешено входить на борт корабля \"Heart of Gold\". Хотя мне всё равно...\n" +
                        "Ну вперед, войдите... Если вам так уж надо, в конце концов... [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне."
            )
        }
    } else {
        println("Пользователь $userLogin, Вам необходимо зарегистрироваться в системе")
    }

}

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"
