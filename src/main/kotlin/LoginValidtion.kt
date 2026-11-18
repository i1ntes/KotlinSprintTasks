fun main() {
    println("Введите логин")
    val userLogin = readln()
    println("Введите пароль")
    val userPassword = readln()
    if (loginValidation(userLogin, userPassword)) println("Добрый день, $userLogin!")
    else println("Логин или пароль недостаточно длинные")
}

fun loginValidation(login: String, password: String): Boolean {
    if (password.length < 4 || login.length < 4) return false
    else return true
}