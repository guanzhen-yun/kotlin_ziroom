package com.ziroom.kotlindemo.chapter6.io

import java.io.File
import java.nio.charset.Charset

//写文件
fun main(args: Array<String>) {
    val fileName = "D:/KotlinDemo/app/src/main/res/data.txt"
    writeFile("ABC", fileName)
    appendFile("DEF", fileName)
}

//覆盖写入
fun writeFile(text: String, destFile: String) {
    val f = File(destFile)
    if(!f.exists()) {
        f.createNewFile()
    }
    f.writeText(text, Charset.defaultCharset())
}

//末尾追加
fun appendFile(text: String, destFile: String) {
    val f = File(destFile)
    if(!f.exists()) {
        f.createNewFile()
    }
    f.appendText(text, Charset.defaultCharset())
}

//追加写入字节数组
fun appendBytes(array: ByteArray, destFile: String) {
    val f = File(destFile)
    if(!f.exists()) {
        f.createNewFile()
    }
    f.appendBytes(array)

    //缓存区写对象
//    f.bufferedWriter()
}

