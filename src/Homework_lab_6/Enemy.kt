package Homework_lab_6

class Enemy(val name: String, val hp: Int, val aggressionLevel: Int = 2) {
    fun calculatePower(): Int {
        return hp * aggressionLevel
    }
}