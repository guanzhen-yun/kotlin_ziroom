package com.ziroom.kotlindemo.chapter1

import com.ziroom.kotlindemo.test.Test  //引入类
import com.ziroom.kotlindemo.test.add  //引入方法
//import com.ziroom.kotlindemo.test.*

/**
 * import导包
 */
fun main(args: Array<String>) {
    val test = Test()  //不需要new
    println(add(1,2))
}