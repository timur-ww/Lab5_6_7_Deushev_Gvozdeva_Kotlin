package magic

fun main(){
    val fireball = Spell("Огненный шар", 3, 3, "\uD83D\uDD25")
    val heal = InstantSpell("Лечение", "\uD83D\uDC9A", 5)

    println("Заклинание: ${fireball.name}")
    println("Символ: ${fireball.symbol}")
    println("Длится: ${fireball.duration} сек")

    println("\nМгновенное заклинание: ${heal.name}")
    println("Символ: ${heal.symbol}")
    println("Сила: ${heal.power}")
    println("Длится: ${heal.duration} сек")
}