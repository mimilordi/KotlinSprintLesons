package org.example.lesson_10

fun main() {
    println("Введите логин:")
    val userLogin = readln()

    println("Введите пароль:")
    val userPassword = readln()

    getCart(verifyCredentials(userLogin, userPassword))
}

fun generateToken(): String {
    val charRange: CharRange = 'a'..'z'
    val upperCaseChar: CharRange = 'A'..'Z'
    val numbersRange = 0..9

    val passwordLength = 32

    val tokenChar = mutableListOf(
        charRange.random(),
        upperCaseChar.random(),
        numbersRange.random()
    )

    val chars = charRange + upperCaseChar + numbersRange
    while (tokenChar.size < passwordLength) {
        tokenChar += chars.random()
    }

    tokenChar.shuffle()

    val token = tokenChar.joinToString("")
    return token
}

fun verifyCredentials(userLogin: String, password: String): String? =
    if (userLogin == LOGIN && password == PASSWORD) generateToken() else null


fun getCart(token: String?) {
    val cart = listOf("Ноутбук", "Мышка", "Клавиатура", "Монитор", "Наушники")

    if (token == null)
        println("Вы не авторизованы")
    else
        println("Ваша корзина ${cart.joinToString()}")
}

const val LOGIN = "billy"
const val PASSWORD = "billy*3403"
