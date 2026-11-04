fun main() {
    val firstNumber = 2
    val secondNumber = 3
    println("""|Решите пример, чтобы доказать, что Вы не бот:
        |$firstNumber+$secondNumber=""".trimMargin())
    val input = readln().toIntOrNull()

    if (input == firstNumber + secondNumber) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}