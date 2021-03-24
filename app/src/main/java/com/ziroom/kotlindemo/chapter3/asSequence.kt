package com.ziroom.kotlindemo.chapter3

//懒序列 只有在你需要的时候才执行序列 相当于java的stream
fun main() {
    val list = listOf(1, 2, 3, 4)

    list.asSequence().filter {
        println(it)
        it % 2 == 0
    }.map {
        println(it)
        it * 2 + 1
    }.forEach {
        println(it)
    }

    //如果没有.forEach  将阻塞不输入
}