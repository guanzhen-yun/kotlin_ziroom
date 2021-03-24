package com.ziroom.kotlindemo.chapter5.zhujie

fun isOdd(x: Int) = x % 2 != 0

var one = 1

//函数引用::
fun main(args: Array<String>) {
    val nums = listOf(1, 2, 3)
    val filteredNums = nums.filter(::isOdd)
    println(filteredNums)

    testReflectProperty()
}

//属性引用
fun testReflectProperty() {
    println(::one.get())
    println(one)
    one = 2
    ::one.set(2)
    println(one)
}