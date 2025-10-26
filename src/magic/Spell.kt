package magic

class Spell (
    name: String,
    val width: Int = 0,
    val heidth: Int = 0,
    symbol: String
) : MagicEffect(name, symbol, 10) {

}