fun main() {
    // Шаг 2. Создание класса и объекта

    /*val naruto: Hero = Hero()
    naruto.name = "Наруто Узумаки"
    naruto.gender = "Мужской"
    naruto.role = "Хокаге"
    naruto.hp = 200
    naruto.mp = 150

    println("Имя: ${naruto.name} \nПол: ${naruto.gender} \nКласс: ${naruto.role} \nЗдороьве: ${naruto.hp} \nМана: ${naruto.mp}\n")

    val sasuke: Hero = Hero()
    sasuke.name = "Саске Учиха"
    sasuke.gender = "Мужской"
    sasuke.role = "Шиноби-отступник"
    sasuke.hp = 120
    sasuke.mp = 180

    println("Имя: ${sasuke.name} \nПол: ${sasuke.gender} \nКласс: ${sasuke.role} \nЗдороьве: ${sasuke.hp} \nМана: ${sasuke.mp}\n")*/

    /*val hero: Hero = Hero()
    print("Введите имя героя: ")
    hero.name = readln()
    print("Введите пол героя: ")
    hero.gender = readln()
    print("Введите класс героя: ")
    hero.role = readln()
    print("Введите элемент героя: ")
    hero.element = readln()
    print("Введиет уровень героя: ")
    hero.level = readln().toInt()
    print("Введите здоровье героя: ")
    hero.hp = readln().toInt()
    print("Введите ману героя: ")
    hero.mp = readln().toInt()*/

    /*println("Имя: ${hero.name} \nПол: ${hero.gender} \nКласс: ${hero.role} \nЗдороьве: ${hero.hp} \nМана: ${hero.mp}\n")*/

    // Шаг 4. Методы внутри класса (функции как часть объекта)

    /*hero.sayHello()
    hero.showStatus()
    hero.meditate()
    hero.takeDamage()*/

    /*for (i in 1..10) {
        hero.castSpell()
    }*/

    /*hero.heal()
    hero.heal()
    hero.heal()*/

    // Шаг 5. Функции с параметрами и взаимодействие объектов

    /*val hero = Hero()
    hero.greet(hero.name)
    hero.greet("Наруто")
    hero.takeDamage(30)
    hero.takeDamage(20)*/

    /*val naruto = Hero()
    naruto.name = "Наруто"
    naruto.role = "Шиноби"
    naruto.element = "Ветер"
    naruto.mp = 100

    val kakshi = Hero()
    kakshi.name = "Какаши"
    kakshi.role = "Шиноби"
    kakshi.element = "Молния"
    kakshi.mp = 100

    val orochimaru = Enemy()
    orochimaru.name = "Орочимару"
    orochimaru.element = "Ветер"

    naruto.showStatus()
    println("Наруто увидел врага ${orochimaru.name}! Его здоровье - ${orochimaru.hp}")
    naruto.attack(orochimaru, 25)

    naruto.castSpellOn(orochimaru, "Расенган", 30)
    naruto.duel(kakshi)*/

    /*val hero1 = Hero("Артур", "муж", "герой", "Воздух", 19, 100, 100)
    println("Герой жив? ${hero1.isAlive()}")
    val hero2 = Hero("Артур", "муж", "герой", "Воздух", 19, 100, 0)
    println("Герой жив? ${hero2.isAlive()}")*/

    val hero = Hero("Артур", "", "", "", 4, 0, 0)
    val easyQuest = Quest("Сбор трав", 2, 100,"Легкий")
    val hardQuest = Quest("Охота на дракона", 10, 1000, "Сложный")

    hero.canAcceptQuest(easyQuest)
    hero.canAcceptQuest(hardQuest)

    val enemy1 = Enemy("Гоблин", 30, "")
    println(enemy1.getThreatLevel())
    val enemy2 = Enemy("Орк", 100, "")
    println(enemy2.getThreatLevel())
    val enemy3 = Enemy("Дракон", 200, "")
    println(enemy3.getThreatLevel())
}
