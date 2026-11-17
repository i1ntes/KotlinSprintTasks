fun main() {
    println("Напишите 5 своих ингредиентов через запятую")
    val userInput = readln()
    val userRecipe = userInput.split(", ")
    println(userRecipe.sorted().joinToString(", "))
}