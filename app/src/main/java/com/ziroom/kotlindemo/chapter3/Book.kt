package com.ziroom.kotlindemo.chapter3

//增加注解的数据类

@PoKo
data class MyBook(val id: Long,
               val name: String,
               val author: Person) {
    init {
        println("Hello")
    }
}

data class Person(val id: Long, val name: String, val age: Int)

fun main() {
//    val book = MyBook(0, "Kotlin int Action", Person(1, "Dmitry", 40))
//    book.copy()
//
////    val id = book.component1()
////    val name = book.component2()
////    val author = book.component3()
//
//    //析构
//    val(id, name, author) = book
//
//    val pair = "Hello" to "World"
//    val(hello, world) = pair

    val book = MyBook::class.java.newInstance()
}