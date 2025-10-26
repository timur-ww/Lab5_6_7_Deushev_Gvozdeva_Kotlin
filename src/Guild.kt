fun main() {
    // Шаг 6. Именованные параметры, this и init

    /*val  quest = Quest()

    print("Введите название квеста: ")
    val title = readln()
    print("Введите время выполнения (в часах): ")
    val duration = readln().toInt()
    print("Введите награду (в монетах): ")
    val reward = readln().toInt()
    print("Введите уровень сложности: ")
    val difficulty = readln()

    quest.title = title
    quest.duration = duration
    quest.reward = reward
    quest.difficulty = difficulty

    quest.init("Охота на троля", 3, 500, "Средний")
    quest.init(
        title = "Охота на троля",
        reward = 500,
        duration = 3,
        difficulty = "Средний"
    )*/

    // Шаг 7. Список квестов

   /* val quests = mutableListOf<Quest>()

    for (i in 1..3) {
        println("Добавим квест #$i")
        val q = Quest()
        print("Название: ")
        val title = readln()
        print("Время (ч): ")
        val duration = readln().toInt()
        print("Награда: ")
        val reward = readln().toInt()
        print("Сложность: ")
        val difficulty = readln()

        q.init(title, duration, reward, difficulty)
        quests.add(q)
        println()
    }

    println("Все доступные квесты: ")
    for (q in quests) {
        q.printInfo()
    }*/

    /*var quest = Quest("Охота на гоблинов", 2, 3400, "легкий")
    quest.printInfo()*/

    val quest = Quest("Побег из замка", 5, 700, "Сложный")
    println("Квест сложный? ${quest.isHard()}")

    val quest1 = Quest("Охота", duration = 2, reward = 300, difficulty = "Средний")
    println(quest1.goldPerHour())

    val quest2 = Quest("Рыбалка", duration = 0, reward = 500, difficulty = "Легкий")
    println(quest2.goldPerHour())

}