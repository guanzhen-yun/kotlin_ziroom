package com.ziroom.kotlindemo.chapter2

/**
 * 函数
 */
fun main(args: Array<String>) {
    //默认参数
    val coffee1 = makeCoffee("拿铁")
    val coffee2 = makeCoffee()

    println(coffee1)
    println(coffee2)

    //具名参数  用命名参数调用函数--在调用函数时，一旦其中一个参数采用了命名参数形式传递，那么其后的所有参数都必须采用命名参数形式传递，除非它是最后一个参数。
    printArea(320.0, 480.0)
    printArea(width = 320.0, height = 480.0)
    printArea(320.0, height = 480.0)
    //    printArea(width = 320.0, 480.0) //编译错误


    //嵌套函数
    println(calculate(10, 5, '+'))
    println(calculate(10, 5, '-'))
}

fun makeCoffee(type: String = "卡布奇诺"): String {
    return "制作一杯${type}咖啡"
}

fun printArea(width: Double, height: Double): Unit {
    val area = width * height
    println("$width x $height 长方形的面积:$area")
}

fun calculate(n1: Int, n2: Int, opr: Char): Int {
    val multiple = 2
    val resultFun = if (opr == '+') {
        fun(a: Int, b: Int): Int {
            return (a + b) * multiple
        }
    } else {
        fun(a: Int, b: Int) = (a - b) * multiple
    }
    return resultFun(n1, n2)
}