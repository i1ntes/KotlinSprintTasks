fun main() {
    val arrayOfItems = arrayOf("курица", "вода", "морковь", "картофель", "лук", "соль")
    println("Какой ингредиент вы ходите найти?")
    val userInput = readln()
    if (userInput in arrayOfItems) println("Ингредиент $userInput в рецепте есть")
        else println("Такого ингредиента в рецепте нет")
}