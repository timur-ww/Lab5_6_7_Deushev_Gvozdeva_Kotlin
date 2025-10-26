class Hero {
    val name: String
    val gender: String
    val role: String
    val element: String
    val level: Int
    var hp: Int
    var mp: Int

    constructor(name: String, gender: String, role: String, element: String, level: Int, mp: Int, hp: Int){
        this.name = name
        this.gender = gender
        this.role = role
        this.element = element
        this.level = level
        this.hp = hp
        this.mp = mp
    }

    fun isAlive(): Boolean {
        return  hp > 0
    }

    fun canAcceptQuest(quest: Quest): Boolean {
        val canAccept = when (quest.difficulty.lowercase()) {
            "легкий" -> level >= 1
            "среднйи" -> level >= 3
            "сложный" -> level >= 5
            else -> false
        }

        if (canAccept) {
            println("$name может принять квест <<${quest.title}>>!")
        } else {
            println("$name не может принять квест <<${quest.title}>>. \nТребуется более высокий уровень.")
        }

        return  canAccept
    }

    fun sayHello() {
        println("Имя - $name, мой путь только начинается!")
    }

    fun showStatus() {
        println("Имя: $name | Класс: $role | HP: $hp | MP: $mp | Level: $level | Element: $element")
    }

    fun meditate() {
        println("$name медитирует...")
        mp += 20
        println("Мана восстановлена! Текущая мана: $mp")
    }

    fun takeDamage() {
        println("$name получает урон!")
        hp -= 10
        println("Осталось здоровья: $hp")
    }

    fun castSpell() {
        if (mp >= 10) {
            mp -= 10
            println("Герой применяет магию! Осталось маны: $mp")
        } else {
            println("Недостаточно маны! У вас $mp маны")
        }
    }

    fun heal() {
        if (mp >= 10) {
            mp -= 10
            hp += 10
            println("Лечусь! Восстановленно здоровье, потрачено 10 маны")
            println("Здоровье: $hp | Маны: $mp")
        } else {
            println("Недостаточно маны! У вас $mp маны")
        }
    }

    fun greet(name: String) {
        println("Привет, $name!")
    }

    fun takeDamage(amount: Int) {
        println("$name получает $amount урона!")

        if (hp > 0) {
            hp -= amount
            println("Осталось здоровья: $hp \n")
        } else if (hp <= 0) {
            die()
        }
    }

    fun die() {
        if (hp <= 0)
            println("Герой умер")
    }

    fun attack(enemy: Enemy, damage: Int) {
        println("$name атакует врага ${enemy.name}!")
        enemy.takeDamage(damage)
    }

    fun castSpellOn(enemy: Enemy, spellName: String, damage: Int) {
        println("$name использует заклинание '$spellName' против ${enemy.name}")

        if (element == enemy.element) {
            println("Стихии совпадают! Урон cнижен")
            val reducedDamage = damage / 2
            enemy.takeDamage(reducedDamage)
        } else {
            enemy.takeDamage(damage)
        }

        mp -= 10
        if (mp < 0) mp = 0
        println("Осталось маны: $mp\n")
    }

    fun duel(opponent: Hero) {
        println("Дуэль между $name и ${opponent.name} начинается!")

        println("$name атакует первым!")
        opponent.takeDamage(15)

        println("${opponent.name} отвечает!")
        this.takeDamage(15)

        println("Дуэль завершена")
        println("Состояние героев: ")
        this.showStatus()
        opponent.showStatus()
    }

    fun showInfo() {
        println("$name (Урвоень: $level)")
    }

}
