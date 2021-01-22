package com.ziroom.kotlindemo.zy1.zuoye

/**
 * 给String扩展一个去除字符a b c 的方法   比如 3a67b -> 367
 */
fun main(args: Array<String>) {
    println("3a67bc".toRemoveABC())
}

fun String.toRemoveABC(): String {
    return filter { it != 'a' && it != 'b' && it != 'c'}
}