
fun main() {
    /**
     * При работе на таможенном терминале важно точно определить категорию каждого груза. Напиши программу, которая проверяет,
     * соответствует ли груз категории "Average". Эта категория имеет следующие параметры: вес от 35 кг (не включительно)
     * до 100 кг (включительно), и объем меньше 100 литров (не включительно).
     * Создай программу, которая отображает соответствие данных груза категории "Average".
     * Вывод программы может выглядеть так: "Груз с весом 42 кг и объемом 120 л соответствует категории 'Average': false"
     * укажи предварительно заданные параметры категории;
     * проверь, соответствуют ли следующие грузы категории "Average": 20 кг / 80 л и 50 кг / 100 л;
     * сделай сравнение непосредственно внутри println() и без использования диапазонов.
     */

    // Параметры груза
    val incomingCargo = 20
    val incomingVolume = 80

    // Груз 2
    val incomingCargoSecond = 50
    val incomingVolumeSecond = 100

    // Вес
    val weightAverage = 35
    val weightAverageMax = 100

    // Объем
    val volumeAverageMax = 100

    println("Груз с весом $incomingCargo кг и объемом $incomingVolume л соответствует категории 'Average': ${(incomingCargo > weightAverage && incomingCargo <=  weightAverageMax)&&(incomingVolume < volumeAverageMax)}")

    println("Груз с весом $incomingCargoSecond кг и объемом $incomingVolumeSecond л соответствует категории 'Average': ${(incomingCargoSecond > weightAverage && incomingCargoSecond <= weightAverageMax)&&(incomingVolumeSecond < volumeAverageMax)}")


    // Принадлежность к категории Average




}