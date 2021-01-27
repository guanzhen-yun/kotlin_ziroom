package com.example.kotlincode

/**
 *
 * @ProjectName:    KotlinCode
 * @Package:        com.example.kotlincode
 * @ClassName:      Student
 * @Description:     java类作用描述
 * @Author:         lifeilei
 * @CreateDate:     1/22/21 3:30 PM
 * @UpdateUser:     更新者：
 * @UpdateDate:     1/22/21 3:30 PM
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class Student(var name: String, var age: Int, var sex: String) {
    override fun toString(): String {
        return "[ name-> $name, sex-> $sex, age-> $age ]"
    }
}

fun filterAge(students: List<Student>): List<Student> = students.filter {
    it.age >= 18
}

fun filterName(students: List<Student>): List<Student> = students.filter {
    it.name.length >= 3
}

fun filterStudent(a: List<Student>, b: (c: List<Student>) -> List<Student>): List<Student> {
    return b(a)
}

fun main(args: Array<String>) {
    val mutableListOf = mutableListOf<Student>(
            Student("张三", 18, "男"),
            Student("Lucy", 20, "女"),
            Student("李四", 16, "男"),
            Student("王五六", 18, "男"),
            Student("李丽丽", 19, "女"),
            Student("张哈哈", 17, "女")
    )

    println(filterAge(mutableListOf))
    println(filterName(mutableListOf))

    val list = mutableListOf.let {
        it.filter { it.age >= 18 && it.name.length >= 3 }
    }
    println(list)

    val filterStudent = filterStudent(mutableListOf) { filterAgeName(mutableListOf) }
    println(filterStudent)
}

fun filterAgeName(students: List<Student>): List<Student> = students.filter { it.age >= 18 && it.name.length >= 3 }