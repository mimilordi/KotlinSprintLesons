package org.example.lesson_11

fun main() {
    val forum = Forum()
    val user1 = forum.createNewUser("Alex")
    val user2 = forum.createNewUser("Kris")

    forum.createNewMessage(user1.userId, "Хай всем!")
    forum.createNewMessage(user2.userId, "Привет!")
    forum.createNewMessage(user1.userId, "Гоу катку")
    forum.createNewMessage(user2.userId, "Погнали")

    forum.printThread()
}

class Forum {
    val members = mutableListOf<Member>()
    val messages = mutableListOf<Message>()

    fun createNewUser(name: String): Member {
        val generatedUserId = (0..10).random()
        val member = Member.MemberBuilder()
            .userId(generatedUserId)
            .userName(name)
            .build()
        members.add(member)
        return member
    }

    fun createNewMessage(id: Int, text: String) {
        val memberId = members.find { it.userId == id }
        if (memberId != null) {
            val newMessage = Message.MessageBuilder()
                .authorId(id)
                .message(text)
                .build()
            messages.add(newMessage)
        } else {
            println("Такого пользователя нет")
        }
    }

    fun printThread() {
        println("Лента сообщений:")
        messages.forEach { message ->
            val authorName = members.find { it.userId == message.authorId }?.userName
            println("$authorName: ${message.message}")
        }
    }
}

class Member(
    val userId: Int,
    val userName: String
) {

    class MemberBuilder {
        var userId: Int = 0
        var userName: String = ""


        fun userId(userId: Int): MemberBuilder {
            this.userId = userId
            return this
        }

        fun userName(userName: String): MemberBuilder {
            this.userName = userName
            return this
        }

        fun build(): Member {
            return Member(userId, userName)
        }
    }
}

class Message(
    var authorId: Int,
    var message: String
) {
    class MessageBuilder {
        var authorId: Int = 0
        var message: String = ""


        fun authorId(authorId: Int): MessageBuilder {
            this.authorId = authorId
            return this
        }

        fun message(message: String): MessageBuilder {
            this.message = message
            return this
        }

        fun build(): Message {
            return Message(authorId, message)
        }
    }
}