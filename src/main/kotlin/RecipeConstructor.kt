fun main() {
    println("Укажите количество ингредиентов в рецепте")
    val recipeSize = readln().toInt()
    val recipe = Array(recipeSize) {"Ингредиент: ${it + 1}:"}
    println("Хорошо, в твоем рецепте будет $recipeSize ингредиентов")
    recipe.forEachIndexed { index, item ->
        println("Какой ингредиент добавить?")
        = readln()
    }
    println(recipe.joinToString(", "))
}