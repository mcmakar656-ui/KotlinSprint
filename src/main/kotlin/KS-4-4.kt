fun main() {
    val dayToday = 5
    val isOddDay = dayToday % 2 == 1

    val lenLongWord = "Упражнения для пресса:".length


    println("""
        ${"Упражнения для рук:".padEnd(lenLongWord)} ${isOddDay}
        ${"Упражнения для ног:".padEnd(lenLongWord)} ${!isOddDay}
        ${"Упражнения для спины:".padEnd(lenLongWord)} ${!isOddDay}
        ${"Упражнения для пресса:".padEnd(lenLongWord)} ${isOddDay}
    """.trimIndent())
}