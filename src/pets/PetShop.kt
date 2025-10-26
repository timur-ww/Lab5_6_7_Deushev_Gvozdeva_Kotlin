package pets

fun main() {
    val pets = listOf(
        Wolf(name = "Фенрир", 5),
        Cat(name = "Мурзик", 90),
        Eagle(name = "Скайвинд"),
        Bear(name = "Балу", 350)
    )

    for (pet in pets) {
        pet.describe()
        pet.makeSound()
        println()
    }

}