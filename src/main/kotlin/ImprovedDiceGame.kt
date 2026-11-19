fun main() {
    var totalHumanWins = 0
    do {
        var humanWins = 0
        val humanRoll = rollDice()
        val robotRoll = rollDice()
        println("Человек наролил: $humanRoll")
        println("Робот наролил: $robotRoll")
        if (humanRoll == robotRoll) println("Победила дружба")
        else if (humanRoll > robotRoll) println("Победило человечество")
        else println("Победила машина")
        val countOfHumanWin = resultCalculation(humanRoll, robotRoll, humanWins)
        totalHumanWins += countOfHumanWin
        println("Хотите бросить кости еще раз?\nВведите Да или Нет")
        val userInput = readln()
    } while (userInput.contains("да", ignoreCase = true))
    println("Человечество выиграло $totalHumanWins раз")
}

fun rollDice(): Int {
    return (1..6).random()
}

fun resultCalculation (humanRoll: Int, robotRoll: Int, humanWins: Int): Int {
    var countOfHumanWins = humanWins
    if (humanRoll > robotRoll) countOfHumanWins++
    return countOfHumanWins
}