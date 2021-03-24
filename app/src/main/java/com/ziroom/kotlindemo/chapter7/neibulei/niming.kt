package com.ziroom.kotlindemo.chapter7.neibulei

//匿名内部类 可以继承父类 或者实现多个接口  java不支持

fun main() {
    //交叉类型 Cloneable & Runnable  (TypeScript支持联合类型 A | B)
    val runnableCloneable = object : Cloneable, Runnable {
        override fun run() {

        }
    }

    //本地函数
    fun localFunc() {
        println("Hello")
    }
}
