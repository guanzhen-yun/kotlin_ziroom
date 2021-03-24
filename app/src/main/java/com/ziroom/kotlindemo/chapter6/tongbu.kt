package com.ziroom.kotlindemo.chapter6

import java.io.File
import java.nio.charset.Charset

//同步方法和块
fun main(args: Array<String>) {
    appendFile("ABC", "D:/KotlinDemo/app/src/main/res/data.txt")
}

//同步方法
@Synchronized fun appendFile(text: String, destFile: String) {
    val f = File(destFile)
    if(!f.exists()) {
        f.createNewFile()
    }
    f.appendText(text, Charset.defaultCharset())
}

//同步代码块
class Sync {
    fun appendFileSync(text: String, destFile: String) {
        val f = File(destFile)
        if(!f.exists()) {
            f.createNewFile()
        }

        synchronized(this) {
            f.appendText(text, Charset.defaultCharset())
        }
    }
}
