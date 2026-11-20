import kotlin.random.Random

fun main() {
    val login = "login"
    val password = "password"
    val itemsList = listOf("T-Shirt", "Dress", "Jeans")
    val getItemList = getItemList(getToken(login, password), itemsList)
    if (getItemList != null) {
        println(getItemList)
    } else println("Неудачная авторизация")
}

fun getToken(login: String, password: String): String? {
    if (EXPECTED_LOGIN == login && EXPECTED_PASSWORD == password) {
        val token = tokenGeneration()
        return token
    } else return null
}

fun tokenGeneration(): String {
    val tokenLength = 32
    val tokenChars = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    val token = (1..tokenLength).map {
        tokenChars.random(Random)
    }.joinToString("")
    return token
}

fun getItemList(token: String?, listOfItems: List<String>): List<String>? {
    if (token != null) {
        return listOfItems
    } else return null
}

const val EXPECTED_LOGIN = "login"
const val EXPECTED_PASSWORD = "password"