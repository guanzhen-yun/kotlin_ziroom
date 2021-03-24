package com.ziroom.kotlindemo.chapter4.teshu
//特殊函数--apply
fun main(args: Array<String>) {
    testApply()
}

fun testApply() {
    //普通写法
    val list = mutableListOf<String>()
    list.add("A")
    list.add("B")
    list.add("C")
    println("普通写法 list= $list")

    //使用apply()函数
    val a = ArrayList<String>().apply {
        add("A")
        add("B")
        add("C")
        println("使用 apply 函数写法 this = $this")
    }
    println(a)
}

