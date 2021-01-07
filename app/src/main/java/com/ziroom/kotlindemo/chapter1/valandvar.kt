package com.ziroom.kotlindemo.chapter1

/**
 * 变量 常量
 */

const val kk = 12  //真正意义的常量   编译期常量  顶层常量  只能是基础数据类型

//相当于一个单例
object AA {
    const val mm = "ss" //对象中的声明常量
    val sss = "sss"
}

//主函数入口
fun main(args: Array<String>) {
//        const val x = 10 //编译错误

    //省略;  当一行多个语句的时候不可以省略
    var m = 12  //默认是Int

    val n = "hello"  //相当java中的final变量

    //  n = "world"  编译期报错

    var t: Long = 20 //显式声明变量类型   注意只有大写的L

    t = m.toLong()

    t = 30L

    var b = 2.5  //默认是double

    val h: Float = 4.6F

    val k: Char = 's'

    val o = 'p'

    val `你好` = "中国"
    val `as` = "中国"

    //it 是一种比较特殊的关键字
    val it = 100
    val ary = arrayListOf("A", "B", "C") //创建一个数组
    ary.forEach { println(it) } //it特定标识符
    println(it)

    val p1 = Person("Tony", 18)  //改成var就不会出错
    println(p1.name)
    println(p1.age)

//    p1 = Person("Tom", 20) //编译错误

}


//定义一个对象
class Person(val name: String, val age: Int)