class Group(val  groupName: String) {
    private val students = mutableListOf<Student>()

    fun addStudent(student: Student){
        students.add(student)
        println("Студент ${student.name} добавлен в группу $groupName")
    }

    fun listStudent(){
        println("Студенты группы $groupName:")
        for (s in students){
            s.info()
        }
    }

    fun birthday(){
        println("В группе $groupName празднуют дни рождения!")
        for (s in students){
            s.haveBirthday()
        }
    }
}