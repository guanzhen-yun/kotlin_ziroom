package com.ziroom.kotlindemo.chapter3

/**
 * 区间
 */
fun main(args: Array<String>) {
    val intRange = 1..10 step 2 //[1,10]
    val floatRange = 1f..2f
    println(intRange.joinToString()) //区间转换字符串

    val intRange2 = 1 until 10 step 2 //[1,10]

    if (1.1f in floatRange) {
        println("在区间范围")
    }

    println(floatRange.endInclusive)
    println(floatRange.to(1.1f))

//    区间遍历
    intRange.forEach { vl -> println(vl) }
    intRange.forEach { println(it) }

    for (i in intRange) {
        println(i)
    }

    val array = intArrayOf(1, 3, 5, 7)

    //数组遍历
    //1.区间
    for (i in 0 until array.size) {
        println(array[i])
    }
    //2.indices 下标
    for (i in array.indices) {
        println(array[i])
    }
}