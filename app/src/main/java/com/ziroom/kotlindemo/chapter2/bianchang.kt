package com.ziroom.kotlindemo.chapter2

/**
 * 变长参数 listOf() 里面的参数实际就是变长参数
 */
fun main(args: Array<String>) {
    f("a", "b", "c")
    f()
}

//vararg
fun f(vararg args: String) {
    println(args[1])
    println(args.contentToString())
}
