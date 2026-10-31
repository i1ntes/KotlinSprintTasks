fun main() {
    val bookedTablesToday = 13
    val bookedTablesTomorrow = 9
    val isAvailableToday = bookedTablesToday < TOTAL_TABLES
    val isAvailableTomorrow = bookedTablesTomorrow < TOTAL_TABLES
    println("Доступность столиков на сегодня: $isAvailableToday \nДоступность столиков на завтра: $isAvailableTomorrow")
}

const val TOTAL_TABLES = 13