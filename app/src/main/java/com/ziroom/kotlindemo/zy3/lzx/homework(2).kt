package com.example.kotlindemo.five

fun main(args: Array<String>) {
//    上节课作业
//    有一组学生列表
//    学生属性(姓名 年龄 性别)
//    定义两个函数(1.年龄大于等于18的成年人
//    2.姓名长度大于三的特殊姓名)
//    要求用高阶函数过滤同时满足1 2 的学生
    var students = mutableListOf<Student>(
            Student("张三", 18, "男", 90),
            Student("李小四", 23, "男", 88),
            Student("好发佛奥解耦", 20, "男", 80),
            Student("阿奇偶饭啊", 22, "男", 60))


    val checkAge = { it: Student -> it.age > 18 }
    val checkName = { it: Student -> it.name.length > 3 }
    val check = fun(checkAge: (Student) -> Boolean, checkName: (Student) -> Boolean): (Student) -> Boolean {
        return { checkAge(it) && checkName(it) }
    }
    println(students.filter(check(checkAge, checkName)))


    val queryResult = students
            .where { it.score > 80 }
            .and { it.age > 20 }
    println(queryResult)
}

fun <E> List<E>.where(predicate: (E) -> Boolean): List<E> {
    val list = this
    val result = arrayListOf<E>()
    for (e in list) {
        if (predicate(e)) {
            result.add(e)
        }
    }
    return result
}

fun <E> List<E>.and(predicate: (E) -> Boolean): List<E> {
    return where(predicate)
}


data class Student(val name: String, val age: Int, val sex: String, val score: Int)
