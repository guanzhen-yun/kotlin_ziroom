package com.ziroom.kotlindemo.chapter4.teshu

//特殊函数--run
fun main(args: Array<String>) {
    testRunFun()
}

fun myfun(): String {
    println("执行了myfun函数")
    return "这是myfun的返回值"
}

//run函数 后面调用传入的Lambda代码块
fun testRunFun() {
    myfun()
    run({ myfun() })
    run { myfun() }
    run { println("A") }
}