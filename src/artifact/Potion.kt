package artifact

class Potion(
    name: String,
    power: Int,
    rarity: String,
    val effectDuration: Int,
    val isConsumable: Boolean
) : MagicItem(name, power, rarity) {

    override fun describe() {
        println("Зелье: $name \nСила: $power \nРедкость: $rarity " +
                "\nДлительность эффекта: $effectDuration сек " +
                "\nОдноразовое: ${if (isConsumable) "Да" else "Нет"}")
    }

    override fun use(): String {
        if (effectDuration <= 0){
            return "$name используется мгновенно"
        }
        return if (isConsumable) {
            "Зелье $name выпито! Эффект длится $effectDuration сек"
        } else {
            "Зелье $name использовано! Можно использовать снова"
        }

    }

}