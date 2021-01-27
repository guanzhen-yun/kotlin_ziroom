package com.ziroom.kotlindemo.chapter3

//中缀运算符
fun main() {
    println("HelloWorld" rotate 5)

    val book = Book()
    val desk = Desk("电脑桌")
    book on desk
}

//字符串翻转
infix fun String.rotate(count: Int): String {
    val index = count % length
    return this.substring(index) + this.substring(0, index)
}

class Book

class Desk(val name: String)

infix fun Book.on(d: Desk) {
    println("书在${d.name}上")
}