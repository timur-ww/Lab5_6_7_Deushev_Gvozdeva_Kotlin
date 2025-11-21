package characters
import world.Quest
import world.QuestType

/*
class Trader (
    val name: String,
    private val quests: MutableList<Quest> = mutableListOf()
) {
    fun showAvailableQuests() {
      println("Доступные квесты от $name: ")
      quests.forEachIndexed { index, quest ->
          println("${index + 1}. ${quest.title} (${quest.questType.
          description}) - Награда: ${quest.reward} золота")
      }
    }

    fun giveQuest(index: Int): Quest {
        return quests[index - 1]
    }

    fun addQuest(quest: Quest) {
        quests.add(quest)
        println("Квест '${quest.title}' добавлен в список $name.")
    }
}*/

// Самостоятельные задания
// Задание 2: Работа с системой ввода-вывода

class Trader(
    private val quests: MutableList<Quest> = mutableListOf()
) {
    fun showAvailableQuests() {
        println("Доступные квесты: ")
        quests.forEachIndexed { index, quest ->
            println("${index + 1}. ${quest.title} (${quest.questType.description}) - Награда: ${quest.reward} золота")
        }
    }

    fun giveQuest(index: Int): Quest {
        return quests[index - 1]
    }

    fun addQuest(quest: Quest) {
        quests.add(quest)
        println("Квест '${quest.title}' добавлен.")
    }

    fun removeQuest(index: Int) {
        quests.removeAt(index - 1)
        println("Квест удален")
    }

    fun start() {
        while (true) {
            println("Выберите действие:\n" +
                    "1 - Добавить квест\n" +
                    "2 - Показать все квесты\n" +
                    "3 - Взять квест (удалить из списка)\n" +
                    "0 - Выйти\n")
            print("Ваш выбор: ")

            when(readLine()){
                "1" -> {
                    print("введите название квеста: ")
                    val title = readln()
                    print("Введите длительность (Часы): ")
                    val duration = readln().toInt()
                    print("Введите награду (золото): ")
                    val reward = readln().toInt()
                    print("Введите сложность: ")
                    val difficulty = readln()
                    print("Введите тип квеста (DELIVERY, ELIMINATION, ESCORT, EXPLORE, BOSSFIGHT): ")
                    val questType = readln().uppercase()
                    addQuest(Quest(title, duration, reward, difficulty, QuestType.valueOf(questType)))
                }

                "2" -> {
                    showAvailableQuests()
                }

                "3" -> {
                    print("Введите номер квеста: ")
                    println("Вы выбрали квест: ${giveQuest(readln().toInt())}")
                }

                "4" -> {
                    print("Введите номер квеста для удаления: ")
                    removeQuest(readln().toInt())
                }

                "0" -> {
                    println("Выход из программы")
                    break
                }
            }
        }
    }
}
