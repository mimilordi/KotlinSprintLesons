package org.example.lesson_2

fun main() {

    val studentsCount: Int = 4
    val firstAverageScore: Float = 3f
    val secondAverageScore: Float = 4f
    val thirdAverageScore: Float = 3f
    val fourthAverageScore: Float = 5f

    val scoreSum = firstAverageScore + secondAverageScore + thirdAverageScore + fourthAverageScore
    val averageScore: Float = scoreSum / studentsCount

    println(averageScore)

}