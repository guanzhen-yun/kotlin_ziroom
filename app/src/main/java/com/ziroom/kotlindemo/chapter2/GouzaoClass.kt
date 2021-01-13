package com.ziroom.kotlindemo.chapter2

/**
 * 构造函数
 */
class GouzaoClass() { //一级构造
    //lateinit 延迟初始化  不能修饰基本数据类型
    lateinit var name: String
    var age = 0

    //二级构造函数
    constructor(name: String) : this() { //声明调用一级构造
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {//间接声明调用主构造
        this.name = name
        this.age = age
    }
}