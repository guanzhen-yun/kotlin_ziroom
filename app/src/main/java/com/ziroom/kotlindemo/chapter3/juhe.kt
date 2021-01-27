package com.ziroom.kotlindemo.chapter3

import java.lang.StringBuilder

//聚合
fun main() {
    val list = listOf(1, 2, 3, 4)
    //fold
    val sb = list.fold(StringBuilder()) { acc, i ->
        acc.append(i)
    }
    println(sb)

    //sum
    println(list.sum())

    //reduce
    val sb2 = list.reduce { acc, i ->
        println("i=$i acc=$acc")
        acc + i
    }
    println(sb2)

    //zip
    val zipArray = list.zip(listOf("a","b","c","d"))
    println(zipArray)
}