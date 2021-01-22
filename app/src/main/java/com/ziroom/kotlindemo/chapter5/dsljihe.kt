package com.ziroom.kotlindemo.chapter5

import java.io.*

//集合类的流式DSL --扩展函数
fun main(args: Array<String>) {
    //String   ---  List<String>
    val lines = "D:/KotlinDemo/app/src/main/res/data.txt"
        .stream()
        .buffered()
        .reader("utf-8")
        .readLines()
    println(lines)
}

fun String.stream() = FileInputStream(this)

fun FileInputStream.buffered() = BufferedInputStream(this)

fun InputStream.reader(charset: String) = InputStreamReader(this, charset)

fun Reader.readLine(): List<String> {
    val result = arrayListOf<String>()
    forEachLine {
        result.add(it)
    }
    return result
}

