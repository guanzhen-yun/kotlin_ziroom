package com.ziroom.kotlindemo.chapter3

/**
 * 单例类
 */
object AA {
    const val m = "sss"
    fun getName(): String {
        return "名字"
    }
}

fun main(args: Array<String>) {
    println(AA.m)
    println(AA.getName())
}
