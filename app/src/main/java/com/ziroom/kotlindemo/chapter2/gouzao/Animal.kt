package com.ziroom.kotlindemo.chapter2.gouzao
//构造函数
open class Animal

//如果定义了副构造器 则Animal可以没有() 不推荐
//class Person : Animal {
//    val age: Int
//    val name: String
//
//    constructor(age: Int, name: String) {
//        this.age = age
//        this.name = name
//    }
//
//    constructor(age: Int) : this(age, "unknown")
//}

//推荐
//class Person(val age: Int, val name: String = "unknown") : Animal()

//@JvmOverloads 注解

class Person
@JvmOverloads //主构造器默认参数在java代码中可以以重载的形式调用
constructor(val age: Int, name: String = "unknown") : Animal()