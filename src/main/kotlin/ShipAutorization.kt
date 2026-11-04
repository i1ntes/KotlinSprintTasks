fun main() {
    println("Введите свой логин")
    val inputLogin = readln()
    when (inputLogin) {
        LOGIN -> {
            println("Введите пароль")
            val inputPassword = readln()
            if (inputPassword == PASSWORD) {
                println("Доброй пожаловать в систему!")
            } else println("Пароль неверный")
        }
        else -> println("Хотите зарегистрироваться?")
    }
}

const val LOGIN = "Zaphod"
const val PASSWORD = "PanGalactic"