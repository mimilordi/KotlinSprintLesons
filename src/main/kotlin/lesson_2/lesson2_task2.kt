package org.example.lesson_2

fun main() {

    val permanentWorkers = 50
    val salary = 30000
    val interns = 30
    val internsSalary = 20000

    val permanentWorkersSalary = permanentWorkers * salary
    val allSalary = permanentWorkersSalary + interns * internsSalary
    val averageSalary = allSalary / (permanentWorkers + interns)

    println(permanentWorkersSalary)
    println(allSalary)
    println(averageSalary)

}