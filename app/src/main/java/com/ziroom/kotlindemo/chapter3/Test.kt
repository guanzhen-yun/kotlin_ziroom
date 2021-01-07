package com.ziroom.kotlindemo.chapter3

fun main(args: Array<String>) {
    val b = BB(3, 4)
    println(b.m)

    val jie = Jie()
    println(jie.getName())

    val childClass = ChildClass("李四", 15)
    println(childClass.age)

    val childClass2 = ChildClass("王五")
    println(childClass2.age)
    println(childClass2.getGender())

    val p2 = Parent2Class()
//    println(p2.name)//运行错误 lateinit property name has not been initialized
    val p3 = Parent2Class("张三")
    println(p3.name)
}

//Jiekou 没有()
class Jie : Jiekou {
    override fun getName(): String {
        return "张三"
    }
}