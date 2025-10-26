package Homework_lab_6

import magic.Spell

class Hero(var name: String, var level: Int) {
    fun showInfo() {
        println("$name (Урвоень: $level)")
    }

    fun canCast(spell: Homework_lab_6.Spell): Boolean {
        return spell.name.length <= level * 2 &&
                spell.width <= 5 &&
                spell.height <= 5
    }
}