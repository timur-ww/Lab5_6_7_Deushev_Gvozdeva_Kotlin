class GuildHero(val name: String ) {
    val members = mutableListOf<Hero1>()

    fun addMember(hero: Hero1) {
        members.add(hero)
    }

    fun showMembers() {
        for (member in members) {
            member.showInfo()
        }
    }

    fun averageLevel(): Double {
        var sum = 0
        for (i in members) {
            sum += i.level
        }
        return sum.toDouble() / members.size
    }

}
