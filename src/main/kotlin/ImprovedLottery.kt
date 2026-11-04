fun main() {
    val winningNumbers = List(3) { kotlin.random.Random.nextInt(-1, 43) }
    println(winningNumbers)
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
        1 -> println("Вы получили утешительный приз!")
        2 -> println("Вы выиграли крупный приз!")
        3 -> println("Вы выиграли Джекпот!")
        else -> println("Неудача")
    }
    println("Выиграли числа: ${winningNumbers[0]}, ${winningNumbers[1]}, ${winningNumbers[2]}")
}