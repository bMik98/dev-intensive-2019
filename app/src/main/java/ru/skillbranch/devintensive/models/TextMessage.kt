package ru.skillbranch.devintensive.models

import java.util.*

class TextMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var text: String?
) : BaseMessage(id, from, chat, isIncoming, date) {

    override fun formatMessage(): String {
        val action = when(isIncoming) {true-> "получил" false-> "отправил"}
        return "$id ${from?.firstName} ${from?.lastName} $action сообщение $text  $date"
    }

}