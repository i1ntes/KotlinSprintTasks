fun main() {
    println("Введите число для вашего таймера")
    var timerCount = readln().toInt()
    val inputTime = timerCount
    while (timerCount > 0) {
        Thread.sleep(1000)
        timerCount--
    }
    println("Прошло $inputTime секунд")
}