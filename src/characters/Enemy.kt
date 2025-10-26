package characters

open class Enemy (
    name: String,
    hp: Int = 0,
    element: String = "Неизвестный"
) : GameCharacter(name, hp, element) {
    fun takeDamage(amount: Int) {
        println("$name получает $amount урона!")

        if (hp > 0) {
            hp -= amount
            println("Осталось здоровья: $hp \n")
        } else if (hp <= 0) {
            println("Умер")
            return
        }
    }
}