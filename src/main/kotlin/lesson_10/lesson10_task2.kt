package org.example.lesson_10

fun main() {
    validateData(userLogin = getLogin(), userPassword = getPassword())
}

fun validateData(userLogin: String, userPassword: String) {
    if (userLogin.length < MIN_SYMBOLS || userPassword.length < MIN_SYMBOLS)
        println("Логин или пароль недостаточно длинные")
    else
        println("Добро пожаловать $userLogin")
}

fun getLogin(): String {
    println("Введите имя пользователя:")
    return readln()
}

fun getPassword(): String {
    println("Введите пароль:")
    return readln()
}

const val MIN_SYMBOLS = 4