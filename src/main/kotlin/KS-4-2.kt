const val WEIGHT_MIN = 35
const val WEIGHT_MAX = 100
const val VOLUME_MAX = 100

fun main() {

    // Параметры груза 1
    val incomingCargo = 20
    val incomingVolume = 80

    // Параметры груза 2
    val incomingCargoSecond = 50
    val incomingVolumeSecond = 100

    println("Груз с весом $incomingCargo кг и объемом $incomingVolume л соответствует категории 'Average': " +
            "${(incomingCargo > WEIGHT_MIN && incomingCargo <= WEIGHT_MAX) && (incomingVolume < VOLUME_MAX)}.")
    println("Груз с весом $incomingCargoSecond кг и объемом $incomingVolumeSecond л соответствует категории 'Average': " +
            "${(incomingCargoSecond > WEIGHT_MIN && incomingCargoSecond <= WEIGHT_MAX) && (incomingVolumeSecond < VOLUME_MAX)}.")

}