package lesson11

fun main() {
    val new = Room(
        cover = "Красивая обложка",
        title = "Разговоры о важном"
    )

    println(new.addParticipant("Major", "разговаривает"))
    println(new.addParticipant("Stella", "микрофон выключен"))
    println(new.addParticipant("Destroyer", "пользователь заглушен"))

    println(new.changeStatus("Major", "микрофон выключен"))
}

class Room(
    val cover: String,
    val title: String,
) {

    val participant = mutableMapOf<String, String>()

    fun addParticipant(nickName: String, status: String) {
        participant[nickName] = status
        println("Добавен пользователь: $nickName, статус: $status")
    }

    fun changeStatus(nickName: String, status: String) {
        if (participant.contains(nickName)) {
            participant[nickName] = status
            println("Статус пользователя: $nickName обновлен на: $status")
        } else {
            println("Такого участника нет")
        }
    }

}