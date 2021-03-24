package com.ziroom.kotlindemo.chapter4

//匿名内部类
fun main() {
    object : Runnable {
        override fun run() {
            println("run in executor")
        }
    }

    //简写为
    Runnable {
        println("run in executor")
    }

    //相当于
    fun Runnable(block: () -> Unit): Runnable {
        return object : Runnable {
            override fun run() {
                block()
            }
        }
    }
}