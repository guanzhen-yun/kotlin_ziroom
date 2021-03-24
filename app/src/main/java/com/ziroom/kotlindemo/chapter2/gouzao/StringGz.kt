package com.ziroom.kotlindemo.chapter2.gouzao

//String构造
fun main() {
    val str = String()
    val str1 = String(charArrayOf('1', '2'))
}

//重载String构造方法
fun String(ints: IntArray): String {
    return ints.contentToString()
}