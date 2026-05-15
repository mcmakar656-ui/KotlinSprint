const val REQUIRED_HUMIDITY = 20
const val  WINTER_SEASON = "зима"

fun main() {

    // Параметры
    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    val isConditions = isSunny && isTentOpen && airHumidity == REQUIRED_HUMIDITY &&  WINTER_SEASON != "зима"
    println("Благоприятные ли условия сейчас для роста бобовых? $isConditions")
}