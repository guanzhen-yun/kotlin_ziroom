package com.ziroom.kotlindemo.chapter4

//斐波那契 高阶函数实现

fun main() {
    cost {
        val fibonacciNext = fibonacci()  //fibonacciNext 是函数类型
        println(fibonacciNext)  // () -> kotlin.Long
        for (i in 0..10) {
            println(fibonacciNext())  //相当于执行fibonacci() 里面的函数return部分
        }
    }
}

//代码消耗时间
fun cost(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    println("${System.currentTimeMillis() - start}ms")
}

fun fibonacci(): () -> Long {
    var first = 1L
    var second = 1L
    return {  //匿名函数
        val next = first + second
        val current = first
        first = second
        second = next
        current
    }
}

//region +折叠

fun getName() {
    println("ssss")
}

//endregion
