package com.ziroom.kotlindemo.chapter2

/**
 * 函数
 */
fun main(args: Array<String>) {
    //默认参数
    val coffee1 = makeCoffee(type = "拿铁")
    val coffee2 = makeCoffee()

    println(coffee1)
    println(coffee2)

    //具名参数  用命名参数调用函数--在调用函数时，一旦其中一个参数采用了命名参数形式传递，那么其后的所有参数都必须采用命名参数形式传递，除非它是最后一个参数。
    printArea(320.0, 480.0)
    printArea(height = 320.0, width = 480.0)
    printArea(320.0, height = 480.0)
//    printArea(height = 320.0, 480.0) //编译错误


    //嵌套函数
    println(calculate(10, 5, '+'))
    println(calculate(10, 5, '-'))

    val f: () -> Unit = ::foo
    f.invoke()
    f()

    val f1 = ::foo //可自行推导
    f1.invoke()

//    val x = Foo::bar

    val u: Int
    val x1: (Foo, String, String) -> Any = Foo::bar
    val x0: Foo.(String, String) -> Any = Foo::bar
    val x2: Function3<Foo, String, String, Any> = Foo::bar
    val x3: (Foo, String) -> Any = Foo::bar
    //有实例化的函数引用
    val fo = Foo()
    val x5: (String, String) -> Any = fo::bar
    x5("2", "3")
    x3(Foo(), "1")
    y(x1)
}

//函数嵌套
fun y(p: (Foo, String, String) -> Any) {
    p(Foo(), "a", "b")
    p.invoke(Foo(), "a", "b")
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

//函数引用
fun foo() {
    println("你好")
}

class Foo {
    fun bar(p0: String, p1: String): Any {
        TODO()
    }

    fun bar(p0: String): Any {
        TODO()
    }

    fun m(p0: String, p1: String): Any {
        TODO()
    }
}

