package org.example.lesson_3

fun main() {

    val playerMove = "D2-D4;0"
    val start: String = playerMove.substring(0, 2)
    val finish: String = playerMove.substring(3, 5)
    val moveNumber: String = playerMove.substring(6, 7)
    println(start)
    println(finish)
    println(moveNumber)

}