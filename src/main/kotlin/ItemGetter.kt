fun main() {
    val arrayOfItems = arrayOf("курица", "вода", "морковь", "картофель", "лук", "соль")
    println("Какой ингредиент вы ходите найти?")
    val userInput = readln()
    for (item in arrayOfItems) {
        if (userInput == item) {
            println("Ингредиент $item в рецепте есть")
        }
    }
    if (userInput !in arrayOfItems) println("Такого ингредиента в рецепте нет")
}