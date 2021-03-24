package com.ziroom.kotlindemo.chapter4

import java.io.File

//统计文件中String每个字符的个数
fun main() {
    File("D:/KotlinDemo/build.gradle.kts").readText().toCharArray()
        .filterNot(Char::isWhitespace)//空白字符  //相当于调用it.isWhitespace()
        .groupBy { it }//分组
        .map { it.key to it.value.size } //映射成一个Pair
        .let {
            println(it)
        }
}