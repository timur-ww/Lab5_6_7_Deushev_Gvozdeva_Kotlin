package world

fun main() {
    /*val quest = Quest("Поиск артефакта", 3, 800, "Средний")
    val contract = Contract("Защита каравана", "Гильдия купцов", "Охрана груза", 1200)
    val specialOp = SpecialOperation("Операция 'Тень'", 2500, 2, true)

    println("Инфрмация о квесте:")
    println("Название: ${quest.title}, Награда: ${quest.reward}")

    println("\nИнформация о контракте:")
    println("Название: ${contract.title}, Заказчик: ${contract.clientName}")

    println("\nИнформация о спецоперации:")
    println("Название: ${specialOp.title}")
    specialOp.showReward()*/

    /*val missions = listOf<Mission>(
        Quest("Охота на монстров", 3,600,"Средний"),
        SpecialOperation("Ночной рейд", 1500, requiredClearance = 2, isCovert = true),
        Contract("Сопровождение каравана", "Гильдия Торговцев",
            "Доставить груз через лес", 800, isUrgent = true)
    )

    for (mission in missions){
        mission.describe()
        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
        println()
    }*/

    /*val escortQuest = Quest(
        title = "Сопроводи торговца до деревни",
        duration = 4,
        reward =  120,
        difficulty = "Средний",
        questType = QuestType.ESCORT
    )
    escortQuest.printInfo()*/


    // Самостоятельные задания lab-8
    // Задание 1: Работа с квестами


    val quest1 = Quest(
        "Доставить посылку в соседний город",
        5,
        100,
        "Легкий",
        QuestType.DELIVERY
    )

    val quest2 = Quest(
        "Исследовать древние руины",
        12,
        400,
        "Сложный",
        QuestType.EXPLORE
    )

    val quest3 = Quest(
        "Провести торговца через лес",
        6,
        180,
        "Средний",
        QuestType.ESCORT
    )

    val quests = listOf(quest1, quest2, quest3)

    println("=== ВСЕ КВЕСТЫ ===")
    for (quest in quests) {
        println("\ndescribe():")
        quest.describe()

        println("\nprintInfo():")
        quest.printInfo()
    }

    println("\n=== КВЕСТЫ ТИПА квестов типа EXPLORE ===")

    for (quest in quests){
        if (quest.questType == QuestType.EXPLORE) {
            quest.describe()
        }
    }
}

