package lesson_11

fun main() {
    val room = Room(
        cover = "Красивая обложка",
        title = "Разговоры о важном"
    )

    val user1 = User("Major", "разговаривает")
    val user2 = User("Stella", "микрофон выключен")
    val user3 = User("Destroyer", "пользователь заглушен")

    room.addParticipant(user1)
    room.addParticipant(user2)
    room.addParticipant(user3)

    room.changeStatus("Major", "микрофон выключен")

    room.showParticipants()
}

class Room(
    val cover: String,
    val title: String,
) {
    val participant = mutableListOf<User>()

    fun addParticipant(user: User) {
        participant.add(user)
        println("Добавен пользователь: ${user.nickName}")
    }

    fun changeStatus(nickName: String, newStatus: String) {
        val user = participant.find { it.nickName == nickName }
        if (user != null) {
            user.status = newStatus
            println("Статус пользователя \"${user.nickName}\" обновлен на \"${user.status}\"")
        } else {
            println("Такого участника нет")
        }
    }

    fun showParticipants() {
        println("\nКомната: $title (${cover})")
        println("Участники: ")
        participant.forEach {
            println("${it.nickName} = ${it.status}")
        }
    }
}

class User(
    val nickName: String,
    var status: String,
)