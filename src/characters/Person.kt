package characters

import kotlin.math.E

fun main() {
    /*val blacksmith = NPC("Кузнец Ульфрик", hasQuest = true)
    println(blacksmith.giveQuest())
    blacksmith.trade()

    val dragon = Boss("Алдуин", 500, "Огонь", phaseCount = 4, isFinalBoss = true)
    dragon.startPhase(2)
    println(dragon.dropLoot())
    dragon.takeDamage(150)*/

    val enemy: GameCharacter = Enemy("Джин")
    val hero: GameCharacter = Hero("Наруто")
    val npc: GameCharacter = NPC("Торговец")

    println(enemy.name)

    (enemy as Enemy).takeDamage(20)
    enemy.takeDamage(20)
    println(enemy.name)
}
