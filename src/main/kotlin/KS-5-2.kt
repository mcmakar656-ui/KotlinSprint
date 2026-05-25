const val acceptYear = 18

fun main() {

    val currentYear = 2026
    val userYear = readln().toInt()

    if(acceptYear >= (userYear - currentYear)){
        println("Показать экран со скрытым контентом")
    }
}