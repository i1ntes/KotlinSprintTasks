fun main() {
    val recipe = mutableListOf("курица", "вода", "морковь")
    println("В рецепте есть базовые ингредиенты: ${recipe.joinToString()}")
    println("Желаете добавить еще?")
    val userInput = readln()
    if (userInput.isEmpty() || !userInput.equals("да", ignoreCase = true)) return
    else println("Какой ингредиент вы хотите добавить?")
    val userIngredient = readln()
    recipe.add(userIngredient)
    println("Теперь в рецепте есть следующие ингредиенты: ${recipe.joinToString()}")
}