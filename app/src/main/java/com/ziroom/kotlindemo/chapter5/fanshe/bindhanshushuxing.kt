package com.ziroom.kotlindemo.chapter5.zhujie
//绑定函数和属性的引用
fun main(args: Array<String>) {
    val digitRegex = "\\d+".toRegex()
    digitRegex.matches("7")  //true
    digitRegex.matches("6")  //true
    digitRegex.matches("5")  //true
    digitRegex.matches("X")  //false

    val isDigit = digitRegex::matches
    isDigit("7")  //true
    isDigit("4")  //true
    isDigit("5")  //true
    isDigit("X")  //false
}