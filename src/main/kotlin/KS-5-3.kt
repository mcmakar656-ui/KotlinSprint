import kotlin.random.Random

fun main() {

    val numberOne = Random.nextInt(0,43)
    val numberSecond = Random.nextInt(0,43)

    println("Угадайте первое число (0-42):")
    val userInputOneNumber = readln().toInt()

    println("Угадайте второе число (0-42):")
    val userInputTwoNumber = readln().toInt()

     if ((numberOne == userInputOneNumber && numberSecond == userInputTwoNumber) || (numberOne == userInputTwoNumber && numberSecond == userInputOneNumber)) {
         println("Поздравляем! Вы выиграли главный приз!")
     } else if((numberOne == userInputOneNumber && numberSecond != userInputOneNumber) || (numberOne != userInputOneNumber && numberSecond == userInputOneNumber)) {
         println("Вы выиграли утешительный приз!")
     } else {
         println("Неудача!")

     }
        println("Правильные числа:${numberOne} и ${numberSecond}")
    }