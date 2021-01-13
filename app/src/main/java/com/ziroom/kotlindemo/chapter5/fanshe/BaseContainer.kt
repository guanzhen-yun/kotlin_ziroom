package com.ziroom.kotlindemo.chapter5.fanshe

import kotlin.reflect.KTypeParameter

open class BaseContainer<T>

//反射--类引用
class Container<T : Comparable<T>> : BaseContainer<T> {
    var elements: MutableList<T>

    constructor(elements: MutableList<T>) {
        this.elements = elements
    }

    fun sort(): Container<T> {
        elements.sort()
        return this
    }

    override fun toString(): String {
        return "Container(elements=$elements)"
    }
}

fun main(args: Array<String>) {
    val container = Container(mutableListOf(1, 3, 2, 5, 4, 7, 6))
    val kClass = container::class
    val jkClass = kClass.java //java类引用

    val typeParameters = kClass.typeParameters //泛型信息 类型参数信息
    val kTypeParameter: KTypeParameter = typeParameters[0]
    println(kTypeParameter.isReified) //reified 在运行时完全可用  泛型类型参数通常在编译期间被擦除
    println(kTypeParameter.name) //T
    println(kTypeParameter.upperBounds) //上界 kotlin.Comparable
    println(kTypeParameter.variance) //INVARIANT  型变

    val constructors = kClass.constructors//构造函数
    for (KFunction in constructors) {
        KFunction.parameters.forEach {
            val name = it.name
            val type = it.type
            println("name= $name") //elements
            println("type= $type") //MutableList
            for (kTypeProjection in type.arguments) {
                println(kTypeProjection.type) //T
            }
        }
    }


}
