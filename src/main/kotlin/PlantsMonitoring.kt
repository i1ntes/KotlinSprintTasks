fun main() {
    val isWeatherSunny = true
    val isTentOpen = true
    val isFavorableConditions = isWeatherSunny && isTentOpen && humidityThreshold == 20 && timeOfYear == "не зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}

const val humidityThreshold = 20
const val timeOfYear = "зима"