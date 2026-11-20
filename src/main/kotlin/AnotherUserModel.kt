fun main() {
    val user1 = User2(
        id = 1,
        login = "Login1",
        password = "Password1",
        email = "user1@gmail.com",
    )
    user1.getInfo()
    user1.setBio()
    user1.changePassword()
    user1.getInfo()
}

class User2(
    var id: Int = 0,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun getInfo() {
        println("Id: $id, Login: $login, Password: $password, Email: $email, Bio: $bio")
    }

    fun setBio() {
        println("Расскажите о себе")
        val userInputBio = readln()
        bio = userInputBio
    }

    fun changePassword() {
        do {
            println("Для смены пароля, пожалуйста, напишите старый пароль")
            val oldPassword = readln()
            if (oldPassword != password) {
                println("Неверный пароль")
            }
        } while (oldPassword != password)
        println("Введите новый пароль")
        val newPassword = readln()
        password = newPassword
        println("Ваш пароль изменен на $password")
    }
}