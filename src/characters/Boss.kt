package characters

class Boss (
    name: String,
    hp: Int,
    element: String,
    val phaseCount: Int = 0,
    val isFinalBoss: Boolean = false
) : Enemy(name, hp, element) {
    fun dropLoot(): String {
        return if (isFinalBoss) {
            "Легендарные предметы"
        } else {
            "Эпические предметы"
        }
    }

    fun startPhase(phaseNumber: Int) {
        require(phaseNumber in 1..phaseCount) {"Неверный номер фазы"}
        println("$name активирует фазу $phaseNumber!")
    }

    /*fun takeDamage(amount: Int) {
        println("$name получает $amount урона!")

        if (hp > 0) {
            hp -= amount
            println("Осталось здоровья: $hp \n")
        } else if (hp <= 0) {
            println("Умер")
            return
        }
    }*/
}