fun main() {
    println("""|Чтобы выиграть в лотерее, нужно угадать 2 числа от 0 до 42.
        |Пожалуйста, введите первое число""".trimMargin())
    val inputNumber1 = readln().toInt()
    println("Пожалуйста, введите второе число")
    val inputNumber2 = readln().toInt()

    if ((inputNumber1 == WINNING_NUMBER_1
        || inputNumber1 == WINNING_NUMBER_2)
        && (inputNumber2 == WINNING_NUMBER_1
        || inputNumber2 == WINNING_NUMBER_2)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (inputNumber1 == WINNING_NUMBER_1
        || inputNumber1 == WINNING_NUMBER_2
        || inputNumber2 == WINNING_NUMBER_1
        || inputNumber2 == WINNING_NUMBER_2) {
        println("Вы выиграли утешительный приз!")
    } else println("Неудача!")
    println("Для победы нужны были числа $WINNING_NUMBER_1 и $WINNING_NUMBER_2")
}

const val WINNING_NUMBER_1 = 16
const val WINNING_NUMBER_2 = 3