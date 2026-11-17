fun main() {
    val recipeSize = 5
    println("Вы можете добавить $recipeSize ингредиентов в свой рецепт")
    val recipe = List(recipeSize) {
        println("Введите название ингредиента №${it + 1}")
        readln()
    }
    val recipeWithoutRepetition = recipe.distinct()
    val recipeSorted = recipeWithoutRepetition.sorted()
    println("Вот Ваш рецепт: ${recipeSorted.joinToString(", ").replaceFirstChar { it.uppercase() }}")
}