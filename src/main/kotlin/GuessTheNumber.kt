fun main() {
    val winningNumber = (1..9).random()
    var attempts = 5
    println("Угадай число от 1 до 9")
    println("У Вас есть 5 попыток")
    do {
        println("Введи предполагаемое число")
        attempts--
        val inputNumber = readln().toInt()
        when {
            winningNumber == inputNumber -> {
                println("Это была великолепная игра!")
                break
            }
            winningNumber != inputNumber -> {
                println("Неверно. Осталось $attempts попыток.")
            }
            winningNumber != inputNumber && attempts == 0 -> {
                println("Было загадано число $winningNumber")
            }
        }
    } while (attempts > 0)
}