package com.ziroom.kotlindemo.chapter3

/**
 * 数组
 */
fun main(args: Array<String>) {
    val c0 = intArrayOf(1, 2, 3, 4, 5)

    val c1 = IntArray(5) { it + 1 }

    println(c0.contentToString()) //数组转换字符串

    println(c1.contentToString())

    val d = arrayOf("Hello", "World")
    d[1] = "Kotlin"
    println("${d[0]}, ${d[1]}")
    //遍历
    d.forEach { index -> println(index) }
    d.forEachIndexed{index, value -> println("index=$index,value=$value")}

    if("Hello" in d) {
        println("Hello 在 d中")
    }
}