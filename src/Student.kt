class Student(val name: String, var  age: Int, val gender: String){

    fun haveBirthday(){
        age++
        if (gender == "муж"){
            println("$name празднует день рождения! Теперь ему $age лет")
        }
        else if (gender == "жен"){
            println("$name празднует день рождения! Теперь ей $age лет")
        }
        else {
            println("Ошибка ввода")
        }
    }

    fun info(){
        println("Меня зовут $name, мне $age лет")
    }
}