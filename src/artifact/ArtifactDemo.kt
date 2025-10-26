package artifact

fun main() {
    val sword = Weapon(
        "Меч-душегуб",
        100,
        "Epic",
        "Физический",
        false
    )

    val potion = Potion(
        "Наилучшее зелье лечения",
        150,
        "Mythical",
        0,
        true
    )

    val amulet = Relic(
        "Гнев предков",
        60,
        "Rare",
        "Данемеры",
        10
    )

    val artifacts: List<MagicItem> = listOf(sword, potion, amulet)

    for (artifact in artifacts) {
        artifact.describe()
        println("Использование: ${artifact.use()} \n")

    }
}