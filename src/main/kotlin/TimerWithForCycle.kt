fun main() {
    println("Введите число для отсчета")
    val userInput = readln().toInt()
    for (sec in userInput downTo 1) {
        println("Осталось $sec секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}