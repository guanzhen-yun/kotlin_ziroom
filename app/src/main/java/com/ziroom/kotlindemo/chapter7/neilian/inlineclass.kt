package com.ziroom.kotlindemo.chapter7.neilian

//内联类 不能继承 也不能被继承 不可以有backing field 但可以有setter or getter

inline class BoxInt(val value: Int): Comparable<Int> {//必须val
    operator fun inc(): BoxInt {
        return BoxInt(value + 1)
    }

    override fun compareTo(other: Int) = value.compareTo(other)  //可以实现接口

//    val name = "BoxInt($value)"
}

fun main() {
    var boxInt = BoxInt(5)
    if(boxInt < 10) {
        println("value is less than 10")
    }
    boxInt++
    println(boxInt)
}

//模拟枚举
inline class State(val ordinal: Int) {
    companion object {
        val Idle = State(0)
        val Busy = State(1)
    }
    fun values() = arrayOf(Idle, Busy)
    val name: String
    get() = ""
}