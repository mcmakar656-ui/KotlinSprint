const val MAX_HUMAN = 70
const val MIN_HUMAN = 55
const val COUNT_BOX = 50



fun main() {
    // наличие повреждений корпуса (Boolean переменная);
    val hasDamageShip = readln().toBoolean()

    // текущий состав экипажа;
    val countHuman =  readln()?.toInt() ?:0

    // количество ящиков с провизией на борту;
    val countBox =  readln()?.toInt() ?:0

    // благоприятность метеоусловий (Boolean переменная).
    val isWeatherGood = readln().toBoolean()

    val isWayTravel = (!hasDamageShip && countHuman in MIN_HUMAN..MAX_HUMAN && countBox > COUNT_BOX) ||
            (hasDamageShip && countHuman == MAX_HUMAN && isWeatherGood && countBox >= COUNT_BOX)
    println(isWayTravel)
}