package com.ziroom.kotlindemo.chapter1

import java.lang.Exception

/**
 * 语句 表达式
 */

fun main(args: Array<String>) {
    //if 语句
    val a = 12
    val b = 23

    if (a > b) {
        println("a大于b")
    } else if (a < b) {
        println("a小于b")
    } else {
        println("a等于b")
    }

    val englishScore = 95
    //if控制结构表达式 会把最后的表达式当成结果返回
    val result = if (englishScore < 60) "不及格" else "及格"  //类似java中的三目运算符
    println(result)

    val res = if (a > b) {
        println("a大于b")
        "a大于b!"
    } else if (a < b) {
        println("a小于b")
        "a小于b!"
    } else {
        println("a等于b")
        "a等于b!"
    }
    println(res)

    //when语句  类型swich case
    val chineseScore = 90
    when (chineseScore) {
        in 10..20 -> println("差的没边啦")  //10..20
        30 -> println("真差")
        60 -> println("刚刚及格啊")
        80, 90 -> println("真优秀啊")
        else -> println("其他")
    }

    val mResult = when (chineseScore) {
        30 -> "真差"
        60 -> "刚刚及格啊"
        80, 90 -> "真优秀啊"
        else -> "其他"
    }
    println(mResult)

    //循环语句
    //for 循环 区间 左右都包括
    for (i in 1..20) {
        print(i.toString() + " ,")
    }

    println()

    //不包括右
    for (i in 1 until 5 step 2) {
        print(i.toString() + " ,")
    }

    println()

    //也可以从集合中循环
    val students = listOf("张三", "李四", "王五")
    for (i in students) {
        println(i)
    }

    for (i in students.indices) { //获取index索引
        println(i)
    }

    //forEach表达式  (内部是个lambda表达式)
    students.forEach({ print(it + " ,") })

    println()

    //while 循环  do while 类似
    var t = 10
    while (t > 0) {
        print(t.toString() + " ")
        t--
    }

    println()

    //break continue和java 类似 不同的是标签

    label@ for (i in 1..10) {
        for (j in 1..5) {
            if (j + i == 5) {
                print(j)
                continue@label
            }
        }
    }

    println()

    //return

    println("最小值是: " + min(10, 8))

    //throw 特殊的表达式 类型没有返回值 相当于java里面的void

    val v = try {
        1/0
        "sss"
    } catch (e: Exception) {
        "yyy"
    }

    println(v)

    val w = throw Exception("xxxxx")
}

fun max(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun min(a: Int, b: Int) = if (a > b) b else a