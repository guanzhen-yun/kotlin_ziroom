package com.ziroom.kotlindemo.chapter6

import kotlin.concurrent.thread

//线程
fun main(args: Array<String>) {
    //对象表达式
    object : Thread() {
        override fun run() {
            sleep(3000)
            println("使用Thread对象表达式: ${currentThread()}")
        }
    }.start()

    //Lambda表达式
    Thread {
        Thread.sleep(2000)
        println("使用Lambda表达式: ${Thread.currentThread()}")
    }

    //Kotlin封装的Thread函数
    val t = Thread {
        Thread.sleep(2000)
        println("使用Lambda表达式: ${Thread.currentThread()}")
    }
    t.isDaemon = false //守护线程
    t.name = "CThread"
    t.priority = 3
    t.start()

    //简化版
    thread(start = true, isDaemon = false, name = "DThread", priority = 3) {
        Thread.sleep(1000)
        println("使用Kotlin封装的函数thread(): ${Thread.currentThread()}")
    }
}