const val REQUIRED_HUMIDITY = 20
const val WINTER_SEASON = "зима"

fun main() {
    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    val isConditions = isSunny && isTentOpen && airHumidity == REQUIRED_HUMIDITY && season != WINTER_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых? $isConditions")
}