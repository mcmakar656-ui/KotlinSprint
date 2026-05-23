import kotlin.random.Random
fun main() {


    val numberOne = Random.nextInt(1, 100)
    val numberTwo = Random.nextInt(1, 100)
    val amountNumbers = numberOne + numberTwo
    println("Подтвердите, что вы не робот, сложите два числа: ${numberOne} и ${numberTwo} = ")
    val sumUser = readln().toInt()

    if (amountNumbers == sumUser) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}