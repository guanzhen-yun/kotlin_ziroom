package com.ziroom.kotlindemo.chapter4

//函数调用
fun main(args: Array<String>) {
    //匿名函数
    val sum = fun(x: Int, y: Int): Int {
        return x + y
    }
    println(sum(1, 2))
    println(sum.invoke(1, 2))
}

