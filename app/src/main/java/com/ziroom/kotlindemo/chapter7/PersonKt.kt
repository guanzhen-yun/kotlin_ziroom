package com.ziroom.kotlindemo.chapter7

import java.io.File

//平台类型
fun main(args: Array<String>) {
    val p = Person()
    val title = p.title  //title为String! 平台类型

//    val length = title.length //运行报错  //编译器无法确定平台类型是不是空的

    val length = title?.length ?: 0

    val file = File("abc")
    val files = file.listFiles()  //file.listFiles()平台类型
//    println(files.size)  //运行报错
    println(files?.size)
}