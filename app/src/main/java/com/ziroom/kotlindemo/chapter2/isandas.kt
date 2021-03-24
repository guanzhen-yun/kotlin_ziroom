package com.ziroom.kotlindemo.chapter2

//is   as 关键字
fun main() {
    val m = 12
    println(m is Int)

    val any: Any = "abc"
    any as String
    println(any.length.toString())

    val kn: Kotliner = PPerson("张三", 12)
    if (kn is PPerson) {
        println(kn.age)
    }

    val kn2: Kotliner = PPerson("李四", 12)
    println((kn2 as? PPerson)?.age)
}

open class Kotliner

class PPerson(var name: String, var age: Int) : Kotliner()