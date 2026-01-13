package org.example.lesson_16

fun main() {
    val firstOrder = Order(1)
    firstOrder.sendMessage("Обработан")
    firstOrder.printStatus()
}

class Order(private val orderId: Int) {
    private var status: String = "Оформлен"

    private fun changeStatus(newStatus: String) {
        status = newStatus
    }

    fun sendMessage(status: String) {
        changeStatus(status)
    }

    fun printStatus() {
        println("Заказ: $orderId, Статус: $status")
    }
}