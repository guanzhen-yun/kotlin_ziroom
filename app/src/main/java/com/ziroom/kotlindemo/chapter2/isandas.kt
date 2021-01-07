package com.ziroom.kotlindemo.chapter2
//is   as 关键字
fun main() {
    val m = 12
    println(m is Int)

    val any: Any = "abc"
    any as String
    print(any.length.toString())
}