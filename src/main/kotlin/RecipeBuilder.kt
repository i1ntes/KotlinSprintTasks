fun main() {
    println("Напишите 5 своих ингредиентов через запятую")
    val userInput = readln()
    val userRecipe = userInput.split(", ").toList()
    println(userRecipe.sorted().joinToString(", "))
}