package org.example.lesson_7

fun main() {

    val rangeNumbers = 0..9
    val rangeChars = 'a'..'z'
    val rangeMaxValues = 1..6

    var password = ""

    for (i in rangeMaxValues step 2) {
        password += rangeNumbers.random()
        password += rangeChars.random()
    }

    println(password)

}