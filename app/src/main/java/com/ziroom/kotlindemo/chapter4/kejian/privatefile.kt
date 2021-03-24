package com.ziroom.kotlindemo.chapter4.kejian

private class A(val name: String)

//模块内访问
internal class B {
    @JvmName("%abc")
    internal fun a() {
        println("sss")
    }
}

fun main() {
    val a = A("张三")
    println(a.name)
}