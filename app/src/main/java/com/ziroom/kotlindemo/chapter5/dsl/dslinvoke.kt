package com.ziroom.kotlindemo.chapter5.dsl
//dsl invoke的一个例子
fun main(args: Array<String>) {
    val hello = Hello()
    hello("Kotlin")
    hello("World")
    hello("Hello", 12)
}

class Hello {
    operator fun invoke(name: String) {
        println("Hello, $name")
    }

    operator fun invoke(name: String, age: Int) {
        println("Hello, $name")
    }
}