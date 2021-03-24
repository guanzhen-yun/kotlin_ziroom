package com.ziroom.kotlindemo.chapter3

/**
 * 扩展函数
 */

fun String.firstChar(): String {
    if (this.length == 0) return ""
    return this[0].toString()
}

fun <T> List<T>.filter(predicate: (T) -> Boolean): MutableList<T> {
    val result = ArrayList<T>()
    this.forEach {
        if (predicate(it)) {
            result.add(it)
        }
    }
    return result
}

//增加属性
var <T> MutableList<T>.firstElement: T
    get() {
        return this[0]
    }
    set(value) {
        this[0] = value
    }

var <T> MutableList<T>.lastElement: T
    get() {
        return this[this.size - 1]
    }
    set(value) {
        this[this.size - 1] = value
    }

fun main(args: Array<String>) {
    println("abc".firstChar())

    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7)
    val result = list.filter { it % 2 == 1 } //Lambda函数
    println(result)
    println(list.firstElement)
    println(list.lastElement)
}