fun main() {
    val user1 = User2(
        id = 1,
        login = "Login1",
        password = "Password1",
        email = "user1@gmail.com",
    )
    println("${user1.id}, ${user1.login}, ${user1.password}, ${user1.email}, ${user1.bio}")
    println("Расскажите о себе")
    val userInputBio = readln()
    user1.bio = userInputBio
    user1.changePassword()
    println("${user1.id}, ${user1.login}, ${user1.password}, ${user1.email}, ${user1.bio}")
}

class User2(
    var id: Int = 0,
    val login: String,
    var password : String,
    val email : String,
    var bio : String = ""
) {
    fun changePassword() {
        do {
            println("Для смены пароля, пожалуйста, напишите старый пароль")
            val oldPassword = readln()
            println("Неверный пароль")
        } while (oldPassword != password)
        println("Введите новый пароль")
        val newPassword = readln()
        password = newPassword
        println("Ваш пароль изменен на $password")
    }
}