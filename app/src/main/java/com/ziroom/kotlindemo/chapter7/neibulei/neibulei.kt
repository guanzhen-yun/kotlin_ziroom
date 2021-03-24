package com.ziroom.kotlindemo.chapter7.neibulei

class Outer {
    inner class Inner //非静态内部类 持有外部类的实例
    class StaticInner //静态内部类
}

fun main() {
    val inner = Outer().Inner() //先构造一个外部类的对象
    val staticInner = Outer.StaticInner() //外部类只相当一个作用域
}