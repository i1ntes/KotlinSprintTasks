fun main() {
    val day = 5

    val isFirstGroup = day % 2 != 0
    val isSecondGroup = !isFirstGroup

    val hands = isFirstGroup
    val legs = isSecondGroup
    val back = isSecondGroup
    val press = isFirstGroup

    println("""|Упражнения для рук: $hands
    |Упражнения для ног: $legs
    |Упражнения для спины: $back
    |Упражнения для пресса: $press""".trimMargin())
}