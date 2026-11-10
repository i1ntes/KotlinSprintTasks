fun main() {
    println("Введите число для отсчета")
    val userInput = readln().toInt()
    for (sec in userInput downTo 1) {
        println("Осталось $sec секунд")
    }
    println("\"Время вышло\"")
}