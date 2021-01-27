package com.ziroom.kotlindemo.zy3.zuoye

//实现String四则运算
fun main() {
    val value = "HelloWorld"
    println(value - "World")
    println(value * 2)
    println(value / 'l')
}

operator fun String.minus(right: Any?) = this.replaceFirst(right.toString(), "")

operator fun String.times(right: Int): String {
    return (1..right).joinToString("") {
        this  //每次循环拼接的字符串
    }
}

operator fun String.div(right: Any?): Int {
    val r = right.toString()
    return this.windowed(r.length, 1) {  //按照一定规则扫描字符串
        it == r
    }.count {  //计数
        it
    }
}

//operator fun String.div(right: Any?): Int {
//    val r = right.toString()
//    val rightLen = r.length
//    var count = 0
//    var star = 0
//    var end = rightLen
//    while (end < this.length) {
//        if(this.substring(star, end).equals(r)) {
//            count++
//        }
//        star++
//        end++
//    }
//    return count
//}