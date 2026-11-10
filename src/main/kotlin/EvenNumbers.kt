fun main() {
    println("Введите свое число")
    val userNumber = readln().toInt()
    for (i in 0..userNumber step 2) {
        print("$i ")
    }
}