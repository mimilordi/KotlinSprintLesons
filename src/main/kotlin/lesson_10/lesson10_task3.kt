package org.example.lesson_10

fun main() {
    val generatedPassword = createPassword(length = getLength())
    println("Ваш пароль: $generatedPassword")
}

fun getLength(): Int {
    println("Введите длину пароля")
    return readln().toInt()
}

fun createPassword(length: Int): String {
    val numberRange = 0..9
    val symbols = arrayOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ')

    var result = ""

    while (result.length < length) {
        result += numberRange.random()
        if (result.length < length) {
            result += symbols.random()
        }
    }
    return result
}
