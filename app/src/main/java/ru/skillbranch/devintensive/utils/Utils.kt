package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val nameParts: List<String>? = fullName?.trim()?.split(" ")
        val firstName = nameParts?.getOrNull(0)
        val lastName = nameParts?.getOrNull(1)
        return Pair(when(firstName) {"" -> null else -> firstName} , lastName)
    }
}