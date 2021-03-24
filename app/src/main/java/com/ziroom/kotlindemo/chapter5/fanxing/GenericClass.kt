package com.ziroom.kotlindemo.chapter5.fanxing

//泛型函数

//类中的
class GenericClass {
    fun <T> console(t: T) {
        println(t)
    }
}

//接口中的
interface GenericInterface {
    fun <T> console(t: T)
}

//包中的  Comparable<T>  Comparable 为T 类型上界  T 实现Comparable接口 compareTo方法
fun <T : Comparable<T>> gt(x: T, y: T): Boolean {
    return x > y
}