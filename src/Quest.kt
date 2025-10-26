class Quest {
    val title: String
    val duration: Int
    val reward: Int
    val difficulty: String

    fun printInfo() {
        println("Название квеста: ${this.title} \nВремя выполнения: ${this.duration} " +
                "\nНаграда: ${this.reward} золотых \nУровень сложности: ${this.difficulty} ")
    }

    /*fun init(title: String, duration: Int, reward: Int, difficulty: String) {
        this.title = title
        this.duration = duration
        this.reward = reward
        this.difficulty = difficulty
    }*/

    /*fun getDifficulty(): String = "Легкий"*/

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }

    constructor (title: String, duration: Int, reward: Int, difficulty: String) {
        this.title = title
        this.duration = duration
        this.reward = reward
        this.difficulty = difficulty
    }

    fun goldPerHour(): Int {
        if (duration == 0) return 0
        return reward / duration
    }
}