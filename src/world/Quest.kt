package world

class Quest(
    title: String,
    val duration: Int,
    reward: Int,
    val difficulty: String
) : Mission(title, reward) {

    override fun describe() {
        println("Квест: '$title' на $duration часов, сложность: $difficulty, " +
                "награда: $reward золотых ")
    }

    fun goldPerHour(): Int {
        require(duration>=0) {"Длительность не может быть отрицательной!"}
        return if (duration == 0) 0 else reward / duration
    }

    fun isHard(): Boolean {
        return difficulty.lowercase() == "сложный"
    }

}
