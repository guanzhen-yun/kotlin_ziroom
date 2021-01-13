package com.ziroom.kotlindemo.chapter3

//集合
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5)
    val mutableList = mutableListOf("a", "b", "c")
    
    val set = setOf(1, 2, 3, 4, 5)
    val mutableSet = mutableSetOf("a", "b", "c")

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    val mutableMap = mutableMapOf(1 to "X", 2 to "Y", 3 to "Z")

    //空的列表
    val emptyList = listOf<Int>() //显示声明List元素类型为Int
    val emptyMap = mapOf<Int, String>()

    list.forEach {
        print("$it,")
    }

    println()

    map.forEach {
        println("K=${it.key}, V=${it.value}")
    }

    list.forEachIndexed {
        index, value -> println("index = $index, value=${value}")
    }

}