fun main() {
    val currentYear = 2026
    println("Пожалуйста, напишите Ваш год рождения")
    val input = readln().toInt()
    if (currentYear - input >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else println("Доступ ограничен")
}

const val AGE_OF_MAJORITY = 18