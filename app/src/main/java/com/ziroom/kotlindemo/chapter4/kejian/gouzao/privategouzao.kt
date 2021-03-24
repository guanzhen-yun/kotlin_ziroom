package com.ziroom.kotlindemo.chapter4.kejian.gouzao

//构造器可以加private
class Person
private constructor(var age: Int, var name: String)

//私有化属性age 外部不能访问
class Person2 (private var age: Int, var name: String)

open class Person3 (var age: Int, var name: String) {
    protected val firstName: String = ""
    private val secondName: String = ""
}

class Person4(var age: Int, var name: String) {
    var firstName: String = ""
    private set //私有set方法 不可高于属性可见性
//    private get  必须和属性可见性一致
}

