package com.ziroom.kotlindemo.chapter3

/**
 * 数据类 不可以被继承 相当于java中的final类  重写了 copy(浅copy) component toString hashCode equals方法
 */
data class BB(val m: Int, val n: Int)

fun main() {
    val b = BB(3, 4)
    b.component1()  //3
    b.component2()  //4
    println(b.m)

    val(m, n) = b
    println("$m, $n")
}