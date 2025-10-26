package transport

fun main(){

    val transports = listOf(
        Horse("Арвак", 60, 2),
        Dragon("Алдуин ", 100, 2,100),
        Boat("Йоррваскр",40,4),
        Teleport("Магический портал",1,50)
    )

    for (transport in transports){
        transport.describe()
        print("Движение: ")
        transport.move()
        print("Особая способность: ")
        transport.specialAbility()
        println()
    }

    // Демонстрация полиморфизма

    for (transport in transports){
        print("${transport.name}: ")
        transport.move()
    }
}