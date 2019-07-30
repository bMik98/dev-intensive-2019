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

    fun transliteration(payload: String, divider: String = " "): String {
        val substituted = payload
            .replace("а", "a")
            .replace("б", "b")
            .replace("в", "v")
            .replace("г", "g")
            .replace("д", "d")
            .replace("е", "e")
            .replace("ё", "e")
            .replace("ж", "zh")
            .replace("з", "z")
            .replace("и", "i")
            .replace("й", "i")
            .replace("к", "k")
            .replace("л", "l")
            .replace("м", "m")
            .replace("н", "n")
            .replace("о", "o")
            .replace("п", "p")
            .replace("р", "r")
            .replace("с", "s")
            .replace("т", "t")
            .replace("у", "u")
            .replace("ф", "f")
            .replace("х", "h")
            .replace("ц", "c")
            .replace("ч", "ch")
            .replace("ш", "sh")
            .replace("щ", "sh'")
            .replace("ъ", "")
            .replace("ы", "i")
            .replace("ь", "")
            .replace("э", "e")
            .replace("ю", "yu")
            .replace("я", "ya")

            .replace("А", "A")
            .replace("Б", "B")
            .replace("В", "V")
            .replace("Г", "G")
            .replace("Д", "D")
            .replace("Е", "E")
            .replace("Ё", "E")
            .replace("Ж", "Zh")
            .replace("З", "Z")
            .replace("И", "I")
            .replace("Й", "I")
            .replace("К", "K")
            .replace("Л", "L")
            .replace("М", "M")
            .replace("Н", "N")
            .replace("О", "O")
            .replace("П", "P")
            .replace("Р", "R")
            .replace("С", "S")
            .replace("Т", "T")
            .replace("У", "U")
            .replace("Ф", "F")
            .replace("Х", "H")
            .replace("Ц", "C")
            .replace("Ч", "Ch")
            .replace("Ш", "Sh")
            .replace("Щ", "Sh'")
            .replace("Ъ", "")
            .replace("Ы", "I")
            .replace("Ь", "")
            .replace("Э", "E")
            .replace("Ю", "Yu")
            .replace("Я", "Ya")
        return if(divider != " ") {
            substituted.replace(" ", divider)
        } else {
            substituted
        }
    }
}