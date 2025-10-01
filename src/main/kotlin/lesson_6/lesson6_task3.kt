package lesson_6

fun main() {

    println("Введите количество секунд: ")
    val seconds = readln().toInt()
    var sec = seconds
    var reverseSeconds = 0

    while (sec > 0 && reverseSeconds <= seconds) {
        println("Осталось секунд: ${++reverseSeconds}")
        sec--
        Thread.sleep(1000)
    }

    println("Время вышло")

}