package com.ziroom.kotlindemo.chapter4.teshu

/**
 * also函数 --- 对比let函数
 */
fun main(args: Array<String>) {
    testAlsoFun()
}

fun testAlsoFun() {
    val a = "ABC".also {
        println(it) //输出ABC
    }
    println(a)
}

