fun main() {
    val recipe = listOf("курица", "вода", "морковь", "лук", "соль", "картофель")
    println("В рецепте есть следующие ингредиенты: ${recipe.joinToString(", ")}")
    recipe.forEach { println(it) }
}