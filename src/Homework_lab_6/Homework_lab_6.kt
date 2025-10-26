package Homework_lab_6

import kotlin.math.E

fun main() {
    // Задание 1: Создание класса Item (предмет) с несколькими конструкторами

    val sword = Item("Меч", "Оружие", 100)
    val potion = Item("Зелье здоровья", "зелье")

    sword.printInfo()
    potion.printInfo()

    // Задание 2: Использование первичного конструктора в классе Locationdanger

    val danger = Location("test", "Высокий", 5)
    val safety = Location("test")

    println("${danger.name} опасен: ${danger.isDangerous()}")
    println("${safety.name} опасен: ${safety.isDangerous()}")

    // Задание 3: Проверка доступности заклинания героем

    val hero = Hero("Asd", 3)
    val spell1 = Spell("Огненый шар", 4, 4)
    val spell2 = Spell("Лед", 3,3)

    println(hero.canCast(spell1))
    println(hero.canCast(spell2))

    // Задание 4: Калькуляция силы врага

    val enemy1 = Enemy("Дракон", 100, 5)
    val enemy2 = Enemy("Орк", 50)

    println("${enemy1.name} (сила: ${enemy1.calculatePower()})")
    println("${enemy2.name} (сила: ${enemy2.calculatePower()})")
}