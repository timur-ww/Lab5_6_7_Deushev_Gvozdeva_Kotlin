package Homework_lab_6

class Item(val name: String, val type: String, val value: Int) {
    constructor(name: String, type: String) : this(name, type, 0)

    fun printInfo() {
        println("Предмет: $name \nТип: $type \nСтоимость: $value \n")
    }
}