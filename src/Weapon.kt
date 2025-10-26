class Weapon {
    var name: String = "Оружие"
    var damage: Int = 10
    var durability: Int = 100
    var type: String = "Обычное"

    fun showInfo() {
        println("Название: $name \nУрон: $damage \nПрочность: $durability \nТип: $type")
    }

    fun use() {
        if (durability <= 0) {
            println("Оружие сломано!")
        } else {
            durability -= 10
            println("$name использовано! Прочность: $durability")

            if (durability <= 0){
                println("Оружие сломано!")
            }
        }

    }

    fun upgrade(bonus: Int) {
        damage += bonus
        println("$name улучшено! Новый урон: $damage")
    }
}