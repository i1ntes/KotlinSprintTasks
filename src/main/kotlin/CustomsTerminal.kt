fun main() {
    val cargoCategory = "Average"
    val minCargoWeight = 36
    val maxCargoWeight = 100
    val maxCargoVolume = 100

    val cargoWeight1 = 20
    val cargoVolume1 = 80

    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Груз с весом $cargoWeight1 кг и объемом $cargoVolume1 л соответствует категории '$cargoCategory': ${(cargoWeight1 >= minCargoWeight) && (cargoWeight1 <= maxCargoWeight) && (cargoVolume1 <= maxCargoVolume)}")
    println("Груз с весом $cargoWeight2 кг и объемом $cargoVolume2 л соответствует категории '$cargoCategory': ${(cargoWeight2 >= minCargoWeight) && (cargoWeight2 <= maxCargoWeight) && cargoVolume2 <= maxCargoVolume}")
}