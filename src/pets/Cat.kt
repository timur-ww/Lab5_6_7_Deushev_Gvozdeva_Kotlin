package pets

class Cat(name: String, val secrecy: Int) : Pet(name = name, speed = 80, maxHealth = 150) {
    override fun makeSound() {
        println("$name мяукает.")
    }

    override fun describe() {
        println("Питомец: $name, Здоровье: $maxHealth, Скорость: $speed")
        println("Наш $name очень скрытный ($secrecy скрытность!) и тихий")
    }
}
