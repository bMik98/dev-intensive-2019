package ru.skillbranch.devintensive.models

import java.util.*

data class User(
    val id: String,
    var firstName: String?,
    var lastName: String?,
    var avatar: String?,
    var rating: Int = 0,
    var respect: Int = 0,
    var lastVisit: Date? = Date(),
    var isOnline: Boolean = false
) {

    companion object Factory {
        private var lastId: Int = -1
        fun makeUser(fullName: String): User {
            val nameParts: List<String>? = fullName.split(" ")
            val firstName = nameParts?.getOrNull(0)
            val lastName = nameParts?.getOrNull(1)
            lastId++
            return User("$lastId", firstName, lastName, null)
        }
    }
}