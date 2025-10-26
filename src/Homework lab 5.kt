fun main() {
    // Задание 1. Создай класс Weapon
    val  weapon = Weapon()
    weapon.showInfo()

    weapon.use()
    weapon.upgrade(5)
    weapon.showInfo()

    // Задание 2. Класс GuildHero — гильдия героев

    val guild = GuildHero("Гильдия")
    guild.addMember(Hero1("Воин", 5))
    guild.addMember(Hero1("Маг", 10))

    guild.showMembers()
    println("Средний уровень: ${guild.averageLevel()}")

    // Задание 3. Добавляем класс "Группа" и взаимодействие

    println("Создана группа")
    val student1 = Student("Тимур", 17,"муж")
    val student2 = Student("Ника", 18, "жен")

    val group = Group("ИСП-231")

    group.addStudent(student1)
    group.addStudent(student2)
    println()

    group.listStudent()
    println()

    group.birthday()
    println()

    group.listStudent()

    // Задание 4. Класс "Геометрический калькулятор"

    val calculator = GeometryCalculator()

    println("=== ПРЯМОУГОЛЬНИКИ ===")
    calculator.rectangleInfo(4, 5)
    calculator.rectangleInfo(3, 6)

    println("=== ОКРУЖНОСТИ ===")
    calculator.circleInfo(5)
    calculator.circleInfo(10)

    println("=== ТРЕУГОЛЬНИКИ ===")
    calculator.triangleInfo(3, 4, 5)
    calculator.triangleInfo(5, 5, 5)
    calculator.triangleInfo(2, 3, 4)

    println("=== ОКРУЖНОСТИ ===")
    calculator.circleInfo(5)
    calculator.circleInfo(10)
}