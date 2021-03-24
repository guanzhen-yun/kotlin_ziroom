package com.ziroom.kotlindemo.chapter6.xiecheng

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

//阻塞式
fun main(args: Array<String>) {
    println("主线程id: ${Thread.currentThread().id}")
    test()
    println("协程执行结束")
}

fun test() = runBlocking {
    //重复执行8次
    repeat(8) {
        println("协程执行$it 线程id: ${Thread.currentThread().id}")
        delay(1000)
    }
}