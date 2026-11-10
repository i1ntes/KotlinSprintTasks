fun main() {
    var passwordLength: Int
    do {
        println("Введите желаемую длину пароля (не короче 6 символов)")
        passwordLength = readln().toInt()
        if (passwordLength < PASSWORD_MINIMAL_LENGTH) {
            println("Вы указали неверное число. Пароль не может быть меньше 6 символов.")
        }
    } while (passwordLength < PASSWORD_MINIMAL_LENGTH)
    var password = ""
    val intCharRange = '0'..'9'
    val lowerCaseCharRange = 'a'..'z'
    val upperCaseCharRange = 'A'..'Z'
    val arrayOfChar = intCharRange.toList() + lowerCaseCharRange.toList() + upperCaseCharRange.toList()
    do {
        password = ""
        for (i in 1..passwordLength) {
            password += arrayOfChar.random()
        }
    } while (!password.any { it in lowerCaseCharRange }
        || !password.any { it in upperCaseCharRange }
        || !password.any { it in intCharRange })
    println("Ваш новый пароль: $password")
}

const val PASSWORD_MINIMAL_LENGTH = 6