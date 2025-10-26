package artifact

class Relic(
    name: String,
    power: Int,
    rarity: String,
    val origin: String,
    var charges: Int
) : MagicItem(name, power, rarity) {

    override fun describe() {
        println("Реликвия: $name \nСила: $power \nПроисхождение: $origin \nЗаряды: $charges")
    }

    override fun use(): String {
        if (charges > 0) {
            charges--
            return "Реликвия $name активирована! Осталось зарядов: $charges"
        } else {
            return "Реликвия $name разряжана!"
        }
    }


}