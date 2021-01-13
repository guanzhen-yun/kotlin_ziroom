package com.ziroom.kotlindemo.chapter5
//dsl invoke的一个例子
fun main(args: Array<String>) {
    val hello = Hello()
    hello("Kotlin")
    hello("World")
}

class Hello {
    operator fun invoke(name: String) {
        println("Hello, $name")
    }
}