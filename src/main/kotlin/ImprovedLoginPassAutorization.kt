fun main() {
    println("Чтобы зарегистрироваться придумайте логин")
    val loginRegistration = readln()
    println("Теперь придумайте пароль")
    val passwordRegistration = readln()

    do {
        println("Введите логин для входа в систему")
        val loginInput = readln()
        println("Введите пароль для входа в систему")
        val passwordInput = readln()
        if (loginInput != loginRegistration || passwordInput != passwordRegistration) {
            println("Логин или пароль введены неверно")
        }
    } while (loginInput != loginRegistration || passwordInput != passwordRegistration)
    println("Авторизация прошла успешно")
    var attemptsToPass = 3
    println("Для входа в систему докажите что вы не робот, решив простой математический пример:")
    while(attemptsToPass > 0) {
        val randomNumbers = (1..9).shuffled().take(2)
        val sumOfRandomNumbers = randomNumbers[0] + randomNumbers[1]
        attemptsToPass--
        println("${randomNumbers[0]} + ${randomNumbers[1]}")
        println("Напишите ответ")
        val inputNumber = readln().toInt()
        if (attemptsToPass == 0) println("Доступ запрещен")
        else if (inputNumber != sumOfRandomNumbers) {
            println("Ответ неверный. Количество оставшихся попыток до блокировки: $attemptsToPass. Решите новый пример:")
            continue
        } else {
            println("Добро пожаловать!")
            break
        }
    }
}