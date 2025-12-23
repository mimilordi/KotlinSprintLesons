package org.example.lesson_14

fun main() {
    val chat = Chat()

    chat.addMessage("Привет всем!", "Маша")

    chat.addThreadMessage(
        parentMessageId = 1,
        text = "Привет, Маша!",
        author = "Саша"
    )

    chat.addThreadMessage(
        parentMessageId = 1,
        text = "Хорошо, что ты с нами",
        author = "Коля"
    )

    chat.addMessage("Как ты?", "Саша")

    chat.addThreadMessage(
        parentMessageId = 2,
        text = "Отлично, благодарю",
        author = "Маша"
    )

    chat.printChat()
}

class Chat {
    val messages: MutableList<Message> = mutableListOf()
    private var messageIdCounter = 0

    fun addMessage(text: String, author: String) {
        messages.add(
            Message(
                id = ++messageIdCounter,
                text = text,
                author = author,
            ),
        )
    }

    fun addThreadMessage(parentMessageId: Int, text: String, author: String) {
        messages.add(
            ChildMessage(
                id = ++messageIdCounter,
                text = text,
                author = author,
                parentMessageId = parentMessageId,
            )
        )
    }

    fun printChat() {
        val groupMessages = messages.groupBy {
            if (it is ChildMessage) it.parentMessageId else it.id
        }

        groupMessages.forEach { (_, group) ->
            group.forEach { msg ->
                if (msg is ChildMessage) {
                    println("\t${msg.author}: ${msg.text}")
                } else {
                    println("${msg.author}: ${msg.text}")
                }
            }
        }
    }
}

open class Message(
    val id: Int,
    val text: String,
    val author: String,
)

class ChildMessage(
    id: Int,
    text: String,
    author: String,
    val parentMessageId: Int,
) : Message(id, text, author)