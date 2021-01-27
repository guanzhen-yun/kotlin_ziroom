package com.ziroom.kotlindemo.zy3.zuoye

import com.ziroom.kotlindemo.chapter5.where
//DSL 实现学生过滤
fun main() {
    listOf(
        Student("关羽", 20, 90.0),
        Student("张飞", 19, 78.0),
        Student("赵云", 21, 81.0),
        Student("黄忠", 28, 87.0),
        Student("马超", 24, 60.0)
    ).select().where { it.age > 20 }.and { it.score > 80 }.sortedByDescending { it.score }.let { println(it) }
}

class Student(val name: String, val age: Int, val score: Double) {
    override fun toString(): String {
        return "name=$name age=$age score=$score"
    }
}

fun <T> List<T>.select() = this

fun <T> List<T>.where(predicate: (T) -> Boolean): List<T> {
    val list = this
    val result = arrayListOf<T>()
    for (e in list) {
        if (predicate(e)) {
            result.add(e)
        }
    }
    return result
}

fun <T> List<T>.and(predicate: (T) -> Boolean) = where(predicate)






