package com.ziroom.kotlindemo.zy.zuoye

/**
 * list转换 list(1,3,5,7,9)  输出 list(19, 15, 11, 7, 3)
 */
fun main(args: Array<String>) {
    val listOld = listOf(1, 3, 5, 7, 9)
    val listNew = listOld.map { it * 2 + 1 }.reversed()
    println(listNew)
}