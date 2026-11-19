import kotlin.random.Random

fun main() {
    val login = "login"
    val password = "password"
    val itemsList = listOf("T-Shirt", "Dress", "Jeans")
    val getItemList = getItemList(tokenGeneration(credentialsValidation(login, password)), itemsList)
    print(getItemList)
}

fun credentialsValidation(login: String, password: String): Boolean {
    val expectedLogin = "login"
    val expectedPassword = "password"
    return (expectedLogin == login && expectedPassword == password)
}

fun tokenGeneration(credentialsIsValid: Boolean): String? {
    val tokenLength = 32
    val tokenChars = ('0'..'9') + ('a'..'z') + ('A'..'Z')
    var token: String? = null
    if (credentialsIsValid) {
        token = (1..tokenLength).map {
            tokenChars.random(Random)
        }.joinToString("")
    }
    return token
}

fun getItemList(token: String?, itemList: List<String>): String {
    if (token != null) {
        return itemList.joinToString(", ")
    } else return "Неудачная авторизация"
}