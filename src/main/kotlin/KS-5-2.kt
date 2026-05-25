const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = 2026
    val userBorn = readln().toInt()

    if ((currentYear - userBorn) >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    }
}