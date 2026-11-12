fun main() {
    val arrayOfItems = arrayOf("курица", "вода", "морковь", "картофель", "лук", "соль")
    do {
        println("Эти ингредиенты есть в блюде: ${arrayOfItems.joinToString(", ")}")
        println("Какой ингредиент вы хотите заменить?")
        val userInput = readln()
        if (userInput in arrayOfItems) {
            println("Ингредиент $userInput в рецепте есть, на что его заменить?")
            val userItemForReplace = readln()
            arrayOfItems.forEachIndexed { index, item ->
                if (userInput in item) {
                    arrayOfItems.set(index, userItemForReplace)
                }
            }
            println("Готово! Вы сохранили следующий список: ${arrayOfItems.joinToString(", ")}")
            break
        } else println("Такого ингредиента в рецепте нет, его заменить нельзя")
    } while (userInput !in arrayOfItems)

}