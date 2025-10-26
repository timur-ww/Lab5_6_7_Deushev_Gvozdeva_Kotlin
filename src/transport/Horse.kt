package transport

class Horse(
    name: String,
    speed: Int,
    capacity: Int
) : Transport(name, speed, capacity) {

    override fun describe() {
        println("Лошадь: $name - скакун \nСкорость: $speed \nВместимость: $capacity персонажей")
    }

    override fun move() {
        println("$name скачет по равнинам")
    }

    override fun specialAbility() {
        println("$name может ускориться в бою")
    }
}