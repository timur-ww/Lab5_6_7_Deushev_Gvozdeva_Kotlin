package characters

class Hero (
    name: String,
    var gender: String = "Неизвестный",
    var role: String = "Неизвестный",
    var level: Int = 0,
    element: String = "Неизвестный",
    hp: Int = 0,
    var mp: Int = 0,
    val experience: Int = 0
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