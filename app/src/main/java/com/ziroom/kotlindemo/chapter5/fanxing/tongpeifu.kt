package com.ziroom.kotlindemo.chapter5.fanxing
//通配符 out T ---?extends T         in T ---- ? super T

interface INext<out T> {  //协变
    fun nextT()
}

fun demo(strs: INext<String>) {
    val objects: INext<Any> = strs  //因为String : Any
}

interface IGet<in T> {//逆变 ？ super T
    fun getT()
}

fun get(x: IGet<Number>) {
    val y: IGet<Double> = x  //因为 Double : Number
}









