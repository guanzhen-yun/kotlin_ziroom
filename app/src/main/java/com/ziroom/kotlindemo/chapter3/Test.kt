package com.ziroom.kotlindemo.chapter3


fun main(args: Array<String>) {
    val b = BB(3, 4)
    println(b.m)

    val jie = Jie()
    println(jie.getName())

    val childClass = ChildClass("李四", 15, 1.0F)
    println(childClass.age)

    val childClass2 = ChildClass("王五", score = 1.0f)
    println(childClass2.age)
    println(childClass2.getGender())

    val b1 = BB(1, 2)
}

//Jiekou 没有()
class Jie : Jiekou {
    override fun getName(): String {
        return "张三"
    }

    //属性实现
    override val score: Float
        get() {
            return 90.0F
        }
}