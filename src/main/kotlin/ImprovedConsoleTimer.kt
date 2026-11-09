fun main() {
    println("Введите число для вашего таймера")
    var timerCount = readln().toInt()
    do {
        println("Осталось секунд: $timerCount")
        Thread.sleep(1000)
        timerCount--
    } while (timerCount > 0)
    println("Время вышло")
}