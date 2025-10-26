package artifact

open class MagicItem(
    val name: String,
    val power: Int,
    val rarity: String
) {
    open fun describe() {
        println("Артефакт: $name \nСила: $power \nРедкость: $rarity")
    }

    open fun use(): String {
        return "$name используется с силой $power"
    }
}