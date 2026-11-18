fun main() {
    println("Введите логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()
    if (loginValidation(userLogin, userPassword)) println("Добрый день, $userLogin!")
    else println("Логин или пароль недостаточно длинные")
}

fun loginValidation(login: String, password: String): Boolean {
    val requiredLength = 4
    if (password.length < requiredLength || login.length < requiredLength) return false
    else return true
}