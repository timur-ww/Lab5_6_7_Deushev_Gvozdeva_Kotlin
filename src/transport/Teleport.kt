package transport

class Teleport(
    name: String,
    capacity: Int,
    val mana: Int
) : Transport(name, Int.MAX_VALUE, capacity) {

    override fun describe() {
        println("Телепорт: $name - магическая телепортация \nСкорость: мгновенная " +
                "\nВместимость: $capacity пероснаж \nСтоимость маны: $mana")
    }

    override fun move() {
        println("$name мгновенно перемещается в другое место")
    }

    override fun specialAbility() {
        println("$name нужна мана для активации, мгновенное перемещение")
    }

}