package com.ziroom.kotlindemo.chapter6.io

import java.io.File
import java.nio.charset.Charset

//读文件
fun main(args: Array<String>) {
    val fileName = "D:/KotlinDemo/app/src/main/res/data.txt"
    val content = getFileContent(fileName)
    println(content)

    println()

    val contentLines = getFileLines(fileName)
    contentLines.forEach { println(it) }

    println()
    getFileBytes(fileName)
}

//readText 读取全部内容字符串
fun getFileContent(fileName: String): String {
    val f = File(fileName)
    return f.readText(Charset.forName("UTF-8"))
}

//readLines 获取文件每行的内容
fun getFileLines(fileName: String): List<String> {
    return File(fileName).readLines(Charset.forName("UTF-8"))
}

//读取为bytes数组
fun getFileBytes(fileName: String) {
    val f = File(fileName)
    val bytes: ByteArray = f.readBytes()
    println(bytes.joinToString(separator = " "))

    //可以直接调用java的一些io类
//    val reader: Reader = f.reader()
//    val inputStream = f.inputStream()
//    val bufferedReader: BufferedReader = f.bufferedReader()
}



