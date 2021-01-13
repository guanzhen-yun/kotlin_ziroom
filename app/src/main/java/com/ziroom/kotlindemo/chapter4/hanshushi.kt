package com.ziroom.kotlindemo.chapter4

//函数式编程
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)
    println(list.filter { it % 2 == 1 })

    //拆解
    //1.表达式
    val predicate = { it: Int -> it % 2 == 1 }
    //2.函数调用
    val filter = list.filter(predicate)
    println(filter)


}