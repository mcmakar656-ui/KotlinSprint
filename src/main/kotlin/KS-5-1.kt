fun main() {

    val numberOne = (1..100).random()
    val numberTwo = (1..100).random()
    println("Сложите два числа: $numberOne и $numberTwo")
    if (readln().toInt() == numberOne + numberTwo) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }

}