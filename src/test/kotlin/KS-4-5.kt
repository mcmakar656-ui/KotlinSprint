const val MAX_HUMAN = 70
const val MIN_HUMAN = 55
const val COUNT_BOX = 50



fun main() {
    // наличие повреждений корпуса (Boolean переменная);
    val countDomageShip = readLine()?.toBoolean()?: false

    // текущий состав экипажа;
    val countHuman = readLine()?.toInt() ?:0

    //количество ящиков с провизией на борту;
    val countBox = readLine()?.toInt() ?:0

    // благоприятность метеоусловий (Boolean переменная).
    val isWeather = readLine()?.toBoolean() ?: false

    val isWayTravel = (!countDomageShip && countHuman in MIN_HUMAN ..MAX_HUMAN && countBox > COUNT_BOX) ||
            (countDomageShip && countHuman == MAX_HUMAN && isWeather && countBox >= COUNT_BOX )
    println(isWayTravel)
}