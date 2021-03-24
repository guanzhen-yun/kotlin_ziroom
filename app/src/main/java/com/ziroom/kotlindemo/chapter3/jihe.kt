package com.ziroom.kotlindemo.chapter3

//集合
fun main(args: Array<String>) {
    val list: List<Int> = listOf(1, 2, 3, 4, 5)//只可以查询
    val mutableList = mutableListOf("a", "b", "c") //可读写
    mutableList.remove("a") //-=
    mutableList.add("d")
    mutableList += "e" //运算符重载
    
    val set = setOf(1, 2, 3, 4, 5)
    val mutableSet = mutableSetOf("a", "b", "c")

    val map = mapOf(1 to 2, 2 to "b", 3 to "c")
    val mutableMap = mutableMapOf(1 to "X", 2 to "Y", 3 to "Z")
    mutableMap[4] = "E" //相当于put

    //空的列表
    val emptyList = listOf<Int>() //显示声明List元素类型为Int
    val emptyMap = mapOf<Int, String>()

    println()

    mutableMap.forEach {
        println("K=${it.key}, V=${it.value}")
    }

    list.forEachIndexed {
        index, value -> println("index = $index, value=${value}")
    }

    //类型别名
//    typealias ArrayList<E> = java.util.ArrayList<E>

}