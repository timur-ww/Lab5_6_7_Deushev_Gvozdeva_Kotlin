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

    val missions = listOf<Mission>(
        Quest("Охота на монстров", 3,600,"Средний"),
        SpecialOperation("Ночной рейд", 1500, requiredClearance = 2, isCovert = true),
        Contract("Сопровождение каравана", "Гильдия Торговцев",
            "Доставить груз через лес", 800, isUrgent = true)
    )

    for (mission in missions){
        mission.describe()
        println("Высокая награда? ${if (mission.isHighReward()) "Да" else "Нет"}")
        println()
    }

}

