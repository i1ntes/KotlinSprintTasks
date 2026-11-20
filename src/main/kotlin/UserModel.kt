fun main() {
    val user1 = User(
        id = 1,
        login = "Login1",
        password = "Password1",
        email = "user1@gmail.com",
    )
    val user2 = User(
        id = 2,
        login = "Login2",
        password = "Password2",
        email = "user2@gmail.com",
    )

    println("${user1.id}, ${user1.login}, ${user1.password}, ${user1.email}")
    println("${user2.id}, ${user2.login}, ${user2.password}, ${user2.email}")
}

class User(
    var id: Int = 0,
    var login: String,
    var password : String,
    var email : String,
)