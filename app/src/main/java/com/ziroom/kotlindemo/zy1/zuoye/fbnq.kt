package com.ziroom.kotlindemo.zy1.zuoye

/**
 * 斐波那契数列 1 1 2 3 5 8 13 21 34
 */
fun main(args: Array<String>) {
    println(getResultNormal(10))
}

/**
 * 递归解法
 */
fun getResultByDg(index: Int): Int {
    if(index == 1 || index == 2) {
        return 1
    } else {
        return getResultByDg(index - 2) + getResultByDg(index - 1)
    }
}

/**
 * 非递归
 */

fun getResultNormal(index: Int): Int {
    if(index == 1 || index == 2) {
        return 1
    }
    var f1 = 1
    var f2 = 1
    var result = 0
    for (m in 3..index) {
        result = f1 + f2
        f1 = f2
        f2 = result
    }
    return result
}