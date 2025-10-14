package org.example.lesson_7

fun main() {

    val charRange: CharRange = 'a'..'z'
    val upperCaseChar: CharRange = 'A'..'Z'
    val numbersRange = 0..9

    val minLength = 6

    println("Введите длину пароля (не менее $minLength):")
    val userLength = readln().toInt()

    if (userLength < minLength) {
        println("Пароль должен содержать минимум $minLength символов")
        return
    }

    val passwordChar = mutableListOf(
        charRange.random(),
        upperCaseChar.random(),
        numbersRange.random()
    )

    val chars = charRange + upperCaseChar + numbersRange
    while (passwordChar.size < userLength) {
        passwordChar += chars.random()
    }

    passwordChar.shuffle()

    val password = passwordChar.joinToString("")

    println("Ваш пароль: $password")

}
