package com.ziroom.kotlindemo.chapter1

/**
 * 变量转换
 */

fun main(args: Array<String>) {
    var t: Long = 12
    val m = 34
    //不可以强制转换
    //t = m  编译期报错
    t = m.toLong()//正常
    println(t)

    val str = m.toString()
    println(str)

    val a = 12
    val b: Long = 23
    var c = a + b  //Long

    val n = "hello"
    val k = "world"
    val kk = n + c
//    val kk = c + n //编译错误  当数字和字符串+ 时  数字不能放前面
    print(kk)
}