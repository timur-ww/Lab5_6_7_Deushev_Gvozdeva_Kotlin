package characters
import world.Quest
import world.QuestType
import kotlin.math.E

fun main() {
    /*val blacksmith = NPC("Кузнец Ульфрик", hasQuest = true)
    println(blacksmith.giveQuest())
    blacksmith.trade()

    val dragon = Boss("Алдуин", 500, "Огонь", phaseCount = 4, isFinalBoss = true)
    dragon.startPhase(2)
    println(dragon.dropLoot())
    dragon.takeDamage(150)*/

    /*val enemy: GameCharacter = Enemy("Джин")
    val hero: GameCharacter = Hero("Наруто")
    val npc: GameCharacter = NPC("Торговец")

    println(enemy.name)

    (enemy as Enemy).takeDamage(20)
    enemy.takeDamage(20)
    println(enemy.name)*/

    /*val trader = Trader("Ральф")

    trader.addQuest(Quest("Собрать травы", 2, 50,"Легкий", QuestType.DELIVERY))
    trader.addQuest(Quest("Убить волков", 3, 100, "Средний", QuestType.ELIMINATION))

    trader.showAvailableQuests()

    val selectedQuest = trader.giveQuest(1)
    selectedQuest.describe()*/

    // Самостоятельные задания lab-8

    // Задание 2: Работа с системой ввода-вывода

   val trader = Trader()
   trader.start()
}

