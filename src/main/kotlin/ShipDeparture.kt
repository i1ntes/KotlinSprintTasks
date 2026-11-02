fun main() {
    println("Корпус корабля цел?")
    val isHullIntact = readLine()
    val isHullIntactValidation = isHullIntact == "Да"

    println("Сколько человек в составе экипажа?")
    val hasEnoughCrew = readLine()!!.toInt()
    val hasEnoughCrewMin = 55
    val hasEnoughCrewMax = 70

    println("Сколько ящиков с провизией на борту?")
    val hasEnoughCargo = readLine()!!.toInt()
    val hasEnoughCargoMin = 50

    println("Погода благоприятная?")
    val isWeatherSafe = readLine()
    val isWeatherSafeValidation = isWeatherSafe == "Да"

    val shipCanDepart = (isHullIntactValidation) && (hasEnoughCrew >= hasEnoughCrewMin)
            && (hasEnoughCrew >= hasEnoughCrewMin)
            && (hasEnoughCargo > hasEnoughCargoMin) ||
            (!isHullIntactValidation) &&
            (hasEnoughCrew == hasEnoughCrewMax) &&
            (hasEnoughCargo >= hasEnoughCargoMin) && (isWeatherSafeValidation)

    println("Корабль готов к отплытию: $shipCanDepart")
}