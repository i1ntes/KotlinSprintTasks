fun main() {
    val codeChars = 1000..9999
    do {
        val code = codeChars.random().toString()
        println("Ваш код авторизации: $code")
        val userInput = readln()
    } while (code != userInput)
    println("Добро пожаловать!")
}