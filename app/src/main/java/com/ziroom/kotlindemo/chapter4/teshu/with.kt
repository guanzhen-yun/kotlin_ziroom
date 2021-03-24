package com.ziroom.kotlindemo.chapter4.teshu
//with函数  -- apply函数对比
fun main(args: Array<String>) {
    testWithFun()
}

fun testWithFun() {
    //无返回值
    with(ArrayList<String>()) {
        add("A")
        add("B")
        add("C")
        println("使用with函数写法 this = $this")
    }.let {
        println(it)
    }
}