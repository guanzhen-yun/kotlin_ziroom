package com.ziroom.kotlindemo.zy2.feilei

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
class Student(var name: String, var age: Int, var sex: String){
    override fun toString(): String {
        return "name-> $name, sex-> $sex, age-> $age"
    }
}

fun filterAge(students: List<Student>): List<Student> = students.filter {
    it.age >= 18
}


fun filterName(students: List<Student>): List<Student> = students.filter {
    it.name?.length >= 3
}

fun main(args: Array<String>) {
    val mutableListOf = mutableListOf<Student>()

    var student = Student("张三",18,"男")
    var student1 = Student("Lucy",20,"女")
    var student2 = Student("李四",16,"男")
    var student3 = Student("王五六",18,"男")
    var student4 = Student("李丽丽",19,"女")
    var student5 = Student("张哈哈",17,"女")

    mutableListOf.add(student)
    mutableListOf.add(student1)
    mutableListOf.add(student2)
    mutableListOf.add(student3)
    mutableListOf.add(student4)
    mutableListOf.add(student5)

    println(filterAge(mutableListOf))
    println(filterName(mutableListOf))

    val list = mutableListOf.let {
        it.filter { it.age >= 18 && it.name.length >= 3 }
    }

    val h = fun(filterAge: G, filterName: F): H {
        return { filterAge(filterName(it)) }
    }

    println(h)
}

typealias G = (List<Student>) -> List<Student>
typealias F = (List<Student>) -> List<Student>
typealias H = (List<Student>) -> List<Student>
