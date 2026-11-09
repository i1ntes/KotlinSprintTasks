fun main() {
    val winningNumber = (1..9).random()
    var attempts = 5
    println("Угадай число от 1 до 9")
    println("У Вас есть $attempts попыток")
    while (attempts > 0) {
        println("Введи предполагаемое число")
        val inputNumber = readln().toInt()
        attempts--
        if (inputNumber == winningNumber) {
            println("Это была великолепная игра!")
            break
        } else if (attempts == 0) {
            println("Было загадано число $winningNumber")
        } else {
            println("Неверно. Осталось $attempts попыток.")
        }
    }
}