package org.example.lesson_3

fun main() {

    val playerMove = "D2-D4;0"
    val splitString = playerMove.split("-", ";")
    val start = splitString[0]
    val finish = splitString[1]
    val moveNumber: String = splitString[2]
    println(start)
    println(finish)
    println(moveNumber)

}