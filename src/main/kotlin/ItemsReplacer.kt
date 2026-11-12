fun main() {
    val arrayOfItems = arrayOf("курица", "вода", "морковь", "картофель", "лук", "соль")
    do {
        println("Эти ингредиенты есть в блюде: ${arrayOfItems.joinToString(", ")}")
        println("Какой ингредиент вы хотите заменить?")
        val userInput = readln()
        var isItemFound = false
        arrayOfItems.forEachIndexed { index, item ->
            if (userInput == item) {
                isItemFound = true
                println("Ингредиент $userInput в рецепте есть, на что его заменить?")
                val userItemForReplace = readln()
                arrayOfItems.set(index, userItemForReplace)
                println("Готово! Вы сохранили следующий список: ${arrayOfItems.joinToString(", ")}")
                break
            }
        }
        if (!isItemFound) println("Такого ингредиента в рецепте нет, его заменить нельзя")
    } while (!isItemFound)
}