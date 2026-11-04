fun main() {
    val winningNumbers = (0..42).shuffled().take(3)
    println("""|Чтобы выиграть в лотерее, нужно угадать 3 числа в диапазоне от 0 до 42.
        |Пожалуйста, введите первое число""".trimMargin())
    val inputNumber1 = readln().toInt()
    println("Пожалуйста, введите второе число")
    val inputNumber2 = readln().toInt()
    println("Пожалуйста, введите третье число")
    val inputNumber3 = readln().toInt()

    val listOfUserNumbers = listOf(inputNumber1, inputNumber2, inputNumber3)
    val countOfCoincidences = winningNumbers.intersect(listOfUserNumbers).size
    when (countOfCoincidences) {
        1 -> println("Вы угадали одно число и получаете утешительный приз!")
        2 -> println("Вы угадали два числа и получаете крупный приз!")
        3 -> println("Вы угадали все числа и выиграли джекпот!")
        else -> println("Вы не угадали ни одного числа.")
    }
    println("Выиграли числа: ${winningNumbers[0]}, ${winningNumbers[1]}, ${winningNumbers[2]}")
}