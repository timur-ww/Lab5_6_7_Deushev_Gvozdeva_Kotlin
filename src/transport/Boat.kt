package transport

class Boat(
    name: String,
    speed: Int,
    capacity: Int
) : Transport(name, speed, capacity) {
    override fun describe() {
        println("Лодка: $name - водный транспорт \nСкорость: $speed " +
                "\nВместимость: $capacity персонажей")
    }

    override fun move() {
        println("$name плывет по воде")
    }

    override fun specialAbility() {
        println("$name может перевозить группу по рекам и озерам")
    }
}