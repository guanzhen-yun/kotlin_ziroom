package com.ziroom.kotlindemo.chapter2

/**
 * 运算符重载 定义一个复数  实部 + 虚部
 * 2 + 3i
 */
class Complex {
    var real: Int = 0
    var image: Int = 0

    constructor()  //无参构造函数

    constructor(real: Int, image: Int) { //有参构造函数
        this.real = real
        this.image = image
    }
    //加法运算符重载
    operator fun plus(c: Complex): Complex {
        return Complex(this.real + c.real, this.image + c.image)
    }

    //减法运算符重载
    operator fun minus(c: Complex): Complex {
        return Complex(this.real - c.real, this.image - c.image)
    }

    override fun toString(): String {
        val img = if(image >= 0) "+${image}i" else "${image}i"
        return "$real${img} "
    }


}