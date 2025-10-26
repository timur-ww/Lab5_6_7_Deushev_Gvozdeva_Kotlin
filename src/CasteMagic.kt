fun main() {

    // Шаг 2. Перегрузка конструкторов

    val  fireWall = Spell("Огненная стена", 5, "\uD83D\uDD25")
    fireWall.cast()

    val iceSheet = Spell("Ледяной щит",4, "\u2744\uFE0F")
    iceSheet.cast()

    // Шаг 3. Конструктор по умолчанию

    val  spell = Spell()
    spell.cast()

    println(fireWall.area())
    println(iceSheet.area())
    println(spell.area())


}