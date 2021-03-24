package com.ziroom.kotlindemo.chapter4.teshu

//it 相当于把调用对象作为参数传入block中
fun main(args: Array<String>) {
    testLetFun()
}

fun testLetFun() {
    1.let { println(it) }
    "ABC".let { println(it) }
    myfun().let {
        println(it)
    }
}