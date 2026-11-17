fun main() {
    val omelettePortion = listOf(2, 50, 15)
    println("Сколько порций омлета вам нужно?")
    val numberOfServings = readln().toInt()
    val quantityOfIngredients = omelettePortion.map {it * numberOfServings}
    println("На $numberOfServings порций вам понадобится: Яиц – ${quantityOfIngredients[0]} шт., молока – ${quantityOfIngredients[1]} мл., сливочного масла – ${quantityOfIngredients[2]} гр.")
}