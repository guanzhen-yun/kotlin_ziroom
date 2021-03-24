package com.ziroom.kotlindemo.chapter6.io

import java.io.File
import java.net.URL
import java.nio.charset.Charset

//网络io
fun main(args: Array<String>) {
    val content = getUrlContent("https://www.baidu.com")
    println(content)
    writeUrlBytesTo("D:/KotlinDemo/app/src/main/res/tupian.jpg", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fa2.att.hudong.com%2F27%2F81%2F01200000194677136358818023076.jpg&refer=http%3A%2F%2Fa2.att.hudong.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1613117668&t=01ea4694343e5852a1ca05b6aae31d4a")
}

//html文本
fun getUrlContent(url: String): String {
    return URL(url).readText(Charset.defaultCharset())
}

fun getUrlBytes(url: String): ByteArray {
    return URL(url).readBytes()
}

//写入文件
fun writeUrlBytesTo(filename: String, url: String) {
    val bytes = URL(url).readBytes()
    File(filename).writeBytes(bytes)
}



