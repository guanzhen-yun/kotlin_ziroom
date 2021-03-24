package com.ziroom.kotlindemo.chapter5.fanxing

//泛型类
class Container<K, V>(var key: K, var value: V) {
    override fun toString(): String {
        return "Container(key=$key, value=$value)"
    }
}

fun testContainer() {
    val container = Container(1, "A")
    println(container)
}

fun main(args: Array<String>) {
    testContainer()
}

