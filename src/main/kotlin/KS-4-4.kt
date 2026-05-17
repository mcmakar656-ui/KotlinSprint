fun main() {
    val dayTrenning = 1
    val move = 2

    val moveHands = true
    val moveLeds = false
    val backHuman = false
    val pressHuman = true

    println("""
        Упражнения для рук: ${dayTrenning % move == 1 && moveHands == true || dayTrenning % move != 1 && !moveHands}
        Упражнения для ног: ${dayTrenning % move != 1 && !moveLeds || dayTrenning % move == 1 && moveLeds == true}
        Упражнения для спины: ${dayTrenning % move != 1 && !backHuman || dayTrenning % move == 1 && backHuman == true}
        Упражнения для пресса: ${dayTrenning % move == 1 && pressHuman == true || dayTrenning % move != 1 && !pressHuman}
    """.trimIndent())
}