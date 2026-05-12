const val NUMBERS_OF_TABLES = 13
fun main() {

    val busyTablesToday = 13
    val busyTablesTomorrow = 9

    val tablesAvailableToday = NUMBERS_OF_TABLES - busyTablesToday > 0
    val tablesAvailableTommorow = NUMBERS_OF_TABLES - busyTablesTomorrow > 0
    println("[Доступность столиков на сегодня: ${tablesAvailableToday}]\n[Доступность столиков на завтра: ${tablesAvailableTommorow}]")

}



