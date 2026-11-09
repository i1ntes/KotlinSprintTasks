fun main() {
    var attemptsToPass = 3
    println("Для входа в систему докажите что вы не робот, решив простой математический пример:")
    while(attemptsToPass > 0) {
        val randomNumbers = (1..9).shuffled().take(2)
        val sumOfRandomNumbers = randomNumbers[0] + randomNumbers[1]
        attemptsToPass--
        println("${randomNumbers[0]} + ${randomNumbers[1]}")
        println("Напишите ответ")
        val inputNumber = readln().toInt()
        if (inputNumber == sumOfRandomNumbers) {
            println("Добро пожаловать!")
            break
        } else if (attemptsToPass == 0) println("Доступ запрещен")
        else {
            println("Ответ неверный. Количество оставшихся попыток до блокировки: $attemptsToPass. Решите новый пример:")
            continue
        }
    }
}