package pets

class Bear(name: String, val power: Int) : Pet(name = name, speed = 50, maxHealth = 550){
    override fun makeSound() {
        println("$name рычит.")
    }

    override fun describe() {
        println("Питомец: $name, Здоровье: $maxHealth, Скорость: $speed")
        println("У $name силушка богатырская - $power")
    }
}