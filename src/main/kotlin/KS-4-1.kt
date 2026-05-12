const val COUNT_TABLE = 13
fun main() {

    val busyTablesToday = 13
    val busyTablesTomorrow = 9

    val freeTablesInHoursToday = (COUNT_TABLE - busyTablesToday) > 0
    val freeTablesTomorrow = (COUNT_TABLE - busyTablesTomorrow) > 0
    println("[Доступность столиков на сегодня: ${freeTablesInHoursToday}]\n[Доступность столиков на завтра: ${freeTablesTomorrow}]")

}



