fun main() {
    val armTraining = true
    val legTraining = false
    val backTraining = false
    val pressTraining = true

    val canArmTraining = !armTraining
    val canBackTraining = !backTraining
    val canPressTraining = !pressTraining
    val canLegTraining = !legTraining

    println("""|Упражнения для рук: $canArmTraining
    |Упражнения для ног: $canLegTraining
    |Упражнения для спины: $canBackTraining
    |Упражнения для пресса: $canPressTraining""".trimMargin())
}