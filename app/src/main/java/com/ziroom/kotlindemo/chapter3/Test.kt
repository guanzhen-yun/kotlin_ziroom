package com.ziroom.kotlindemo.chapter3

import com.ziroom.kotlindemo.chapter2.GouzaoClass

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
}

//Jiekou 没有()
class Jie : Jiekou {
    override fun getName(): String {
        return "张三"
    }
}