const val REQUIRED_HUMIDITY = 20

fun main() {

    // Параметры
    var isSunny: Boolean = true
    var isTentOpen: Boolean = true
    var airHumidity: Int = 20
    var isWinter: Boolean = false


    val isConditions = isSunny && isTentOpen && airHumidity == REQUIRED_HUMIDITY  && !isWinter



    println("Благоприятные ли условия сейчас для роста бобовых $isConditions")

}