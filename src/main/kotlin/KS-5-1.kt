fun main() {

    print("Введите первое число: ")
    val numberOne = readln().toInt()
    print("Введите второе число: ")
    val numberTwo = readln().toInt()
    print("Введите результат: ")
    val resultNumber = readln().toInt()
    val resultAuthorization = numberOne + numberTwo

    if(resultAuthorization == resultNumber) {
        println("Добро пожаловать!")
    } else{
        println("Доступ запрещен.")
    }

}
