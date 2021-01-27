package com.example.kotlincode.dsl

/**
 *
 * @ProjectName:    KotlinCode
 * @Package:        com.example.kotlincode
 * @ClassName:      DLSCode
 * @Description:     java类作用描述
 * @Author:         lifeilei
 * @CreateDate:     1/27/21 3:43 PM
 * @UpdateUser:     更新者：
 * @UpdateDate:     1/27/21 3:43 PM
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class Student(var name: String, var age: Int, var sex: String, var score: Int){
    override fun toString(): String {
        return "[ name-> $name, sex-> $sex, age-> $age, score-> $score ]"
    }
}

fun <T> List<T>.filter() : List<T> = this

fun <T> List<T>.where(c:(T) -> Boolean ) : List<T>{
    val list = this
    val result = arrayListOf<T>()
    for(t in list){
        if (c(t)){
            result.add(t)
        }
    }

    return result
}

operator fun String.plus(s:String) : String {
    return "$this${s}"
}

operator fun String.minus(s: String): String {
    return this.replace(s,"")
}

operator fun String.times(s: Int): String {
    val sb = StringBuilder()
    for (a in 1..s){
        sb.append(this)
    }
    return "${sb}"
}

operator fun String.div(s:Char) : Int {
    var count = 0
    val ca = this.toCharArray()
    for (c in ca) {
        if (c == s) count += 1
    }
    return count
}

fun main(args: Array<String>) {
    val students = mutableListOf<Student>(
            Student("张三", 18, "男", 96),
            Student("Lucy", 20, "女", 100),
            Student("李四", 16, "男", 56),
            Student("王五六", 18, "男", 60),
            Student("李丽丽", 21, "女", 79),
            Student("张哈哈", 23, "女", 80)
    )

    val stus = students.filter()
            .where { it.age >= 20 && it.score >= 80 }.sortedBy { it.score }.let {
                println(it)
        }

    println(stus)
    println("Hello" + "World")
    println("HelloWorldWorld" - "World")
    println("HelloHello" * 2)
    println("HelloHello" / 'H')
}