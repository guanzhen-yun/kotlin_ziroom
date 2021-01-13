package com.ziroom.kotlindemo.chapter2

fun main(args: Array<String>) {
    //构造函数
    val p2 = GouzaoClass()
    println(p2.name)//运行错误 lateinit property name has not been initialized
    val p3 = GouzaoClass("张三")
    println(p3.name)

    val c1 = Complex(3,4) //3 + 4i
    val c2 = Complex(1, 2) // 1 + 2i

    //运算符重载
    //复数的加减
    println(c2 + c1) //4 + 6
    println(c2 - c1) //-2 - 2i
}