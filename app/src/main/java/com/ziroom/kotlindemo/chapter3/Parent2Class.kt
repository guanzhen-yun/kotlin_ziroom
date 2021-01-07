package com.ziroom.kotlindemo.chapter3

class Parent2Class() {
    //lateinit 延迟初始化  不能修饰基本数据类型
    lateinit var name: String
    var age = 0

    constructor(name: String) : this() {
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {
        this.name = name
        this.age = age
    }
}