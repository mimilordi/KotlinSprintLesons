package org.example.lesson_8

fun main() {

    val rangeNumbers = 0..20
    val arrayCountOfViews = intArrayOf(1, 2, 3, 4, 5, 6, 7)

    for (i in arrayCountOfViews.indices) {
        arrayCountOfViews[i] = rangeNumbers.random()
    }

    println("Просмотров за неделю: ${arrayCountOfViews.sum()}")

}