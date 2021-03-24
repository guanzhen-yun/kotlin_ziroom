package com.ziroom.kotlindemo.chapter2.gouzao.factory
//构造同名的工厂函数
class Person(var age: Int, var name: String = "unknown") {
    override fun equals(other: Any?) =
        (other as? Person)?.name?.equals(name) ?: false

    override fun hashCode() = name.hashCode()
}

val persons = HashMap<String, Person>()
//对象工厂
fun Person(name: String): Person {
    return persons[name] ?: Person(1, name).also {
        println(it.name)
        persons[name] = it //不存在就存储一条数据
    }
}

fun main() {
    val p = Person("张三")
    println(p.age)
}

