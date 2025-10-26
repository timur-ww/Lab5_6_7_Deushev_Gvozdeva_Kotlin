package transport

class Dragon(
    name: String,
    speed: Int,
    capacity: Int,
    val power: Int
) : Transport(name, speed, capacity) {

    override fun describe() {
        println("Дракон: $name - сильное существо \nСкорость: $speed " +
                "\nВместимость: $capacity персонажей \nСила огня: $power")
    }

    override fun move() {
        println("$name летит выскоко над землей")
    }

    override fun specialAbility() {
        println("$name дышит огнем и перевозит героя по воздуху")
    }

}