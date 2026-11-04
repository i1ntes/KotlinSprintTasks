fun main() {
    println("""|Решите пример, чтобы доказать, что Вы не бот:
        |2+2=""".trimMargin())
    val result = readln().toIntOrNull()

    if (result == 4) println("Добро пожаловать!")
    else println("Доступ закрыт")
}