package pets

class Wolf(name: String, val packSize: Int) : Pet(name = name, speed = 100, maxHealth = 250){
    override fun makeSound() {
        println("$name воет.")
    }

    override fun describe() {
        println("Питомец: $name, Здоровье: $maxHealth, Скорость: $speed")
        println("У $name рвзмер стаи - $packSize")
    }
}