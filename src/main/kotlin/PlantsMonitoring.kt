fun main() {
    val isWeatherSunny = true
    val isTentOpen = true
    val humidityThresholdNow = 20
    val timeOfYearNow = "зима"
    val isFavorableConditions = isWeatherSunny && isTentOpen && humidityThresholdNow == HUMIDITY_THRESHOLD && timeOfYearNow != TIME_OF_YEAR

    println("Благоприятные ли условия сейчас для роста бобовых? $isFavorableConditions")
}

const val HUMIDITY_THRESHOLD = 20
const val TIME_OF_YEAR = "зима"