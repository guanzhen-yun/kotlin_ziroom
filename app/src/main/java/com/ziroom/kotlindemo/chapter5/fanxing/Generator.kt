package com.ziroom.kotlindemo.chapter5.fanxing

import java.util.*

//泛型接口
interface Generator<T> {
    operator fun next(): String {
        return ""
    }
}

fun testGenerator() {
//    val gen = object : Generator<Int> {  //onject声明一个Generator实现类
//        override fun next(): Int {
//            return Random().nextInt()
//        }
//    }
//    println(gen.next())
}

class GG : Generator<Int> {
//    override fun next(): Int {
//        TODO("Not yet implemented")
//    }

}

fun main(args: Array<String>) {
    testGenerator()
}