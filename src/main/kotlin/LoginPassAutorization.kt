fun main() {
    println("Чтобы зарегистрироваться придумайте логин")
    val loginRegistration = readln()
    println("Теперь придумайте пароль")
    val passwordRegistration = readln()
    do {
        println("Введите логин для входа в систему")
        val loginInput = readln()
        println("Введите пароль для входа в систему")
        val passwordInput = readln()
        if (loginInput != loginRegistration || passwordInput != passwordRegistration) {
            println("Логин или пароль введены неверно")
        }
    } while (loginInput != loginRegistration || passwordInput != passwordRegistration)
    println("Авторизация прошла успешно")
}