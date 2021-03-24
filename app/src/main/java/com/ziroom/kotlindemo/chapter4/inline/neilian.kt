package com.ziroom.kotlindemo.chapter4.inline

/**
 * 内联函数inline
 */
fun main() {
    val ints = intArrayOf(1, 2, 3, 4)
    ints.forEach {
        println("Hello $it")
    }

    //内联函数 将省去 costTime 开销 和 block: lambda表达式开销
    costTime {
        println("Hello")
    }
}

inline fun costTime(block:() -> Unit) {
    val start = System.currentTimeMillis()
    block()  //相当于直接替换println("Hello")
    println(System.currentTimeMillis() - start)
}




