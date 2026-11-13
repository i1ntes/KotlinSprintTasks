fun main() {
    println("Укажите количество ингредиентов в рецепте")
    val recipeSize = readln().toInt()
    println("Хорошо, в твоем рецепте будет $recipeSize ингредиентов")
    val recipe = Array(recipeSize) {
        println("Введите название ингредиента №${it + 1}")
        readln()
    }
    println("Вот твой рецепт: ${recipe.joinToString(", ")}")
}