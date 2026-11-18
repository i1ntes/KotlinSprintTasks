fun main() {
    val humanRoll = rollDice()
    val robotRoll = rollDice()
    println("Человек наролил: $humanRoll")
    println("Робот наролил: $robotRoll")
    if (humanRoll == robotRoll) println("Победила дружба")
    else if (humanRoll > robotRoll) println("Победило человечество")
    else println("Победила машина")
}

fun rollDice(): Int {
    return (1..6).random()
}