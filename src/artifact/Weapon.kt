package artifact

import transport.Boat

class Weapon(
    name: String,
    power: Int,
    rarity: String,
    val damageType: String,
    val isTwoHanded: Boolean
) : MagicItem(name, power, rarity) {

    override fun describe() {
        println("Оружие: $name \nСила: $power \nРедкость: $rarity \nТип урона: $damageType " +
                "\nТребует две руки: ${if (isTwoHanded) "Да" else "Нет"}")
    }

    override fun use(): String {
        return "Наносит $damageType урон силой $power"
    }

}