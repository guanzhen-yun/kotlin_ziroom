package com.ziroom.kotlindemo.chapter2

import java.io.IOException

/**
 * 几种特殊类型
 */
fun main(args: Array<String>) {
    val m = add(3, 4)
    println("m=$m")  //kotlin.Unit

//    val date = readDate()  //没有返回值 date不可用

    println(getValue(1))
    println(getValue("hello"))
}

fun getValue(a: Any): String {
    return a.toString()
}

fun add(a: Int, b: Int) {
    println(a + b)
}

fun readDate(): Nothing {
    throw IOException()
}