fun main() {
    val dayToday = 5
    val isOddDay = dayToday % 2 == 1

    println("""
        Упражнения для рук: $isOddDay
        Упражнения для ног: ${!isOddDay}
        Упражнения для спины: ${!isOddDay}
        Упражнения для пресса: $isOddDay
    """.trimIndent())
}