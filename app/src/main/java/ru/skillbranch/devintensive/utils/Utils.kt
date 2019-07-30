package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val nameParts: List<String>? = fullName?.trim()?.split(" ")
        val firstName = nameParts?.getOrNull(0)
        val lastName = nameParts?.getOrNull(1)
        return Pair(
            when (firstName) {
                "" -> null
                else -> firstName
            }, lastName
        )
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        val first = getFirstLetter(firstName)
        val last = getFirstLetter(lastName)
        return when {
            first == null && last == null -> null
            first == null && last != null -> "$last"
            first != null && last == null -> "$first"
            else -> "$first$last"
        }
    }

    private fun getFirstLetter(value: String?): Char? {
        return when {
            value.isNullOrEmpty() -> null
            value.isNullOrBlank() -> null
            else -> value.trim().first().toUpperCase()
        }
    }
}