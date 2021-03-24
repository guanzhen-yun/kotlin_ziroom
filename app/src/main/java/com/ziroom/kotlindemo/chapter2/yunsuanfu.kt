package com.ziroom.kotlindemo.chapter2

/**
 * 运算符
 */
fun main(args: Array<String>) {
    //安全调用运算符(?.)
    val divNumber1 = divide(100, 0)
    val result1 = divNumber1?.plus(100) //divNumber1 + 100,结果为null
    println(result1)

    val divNumber2 = divide(100, 10)
    val result2 = divNumber2?.plus(100) //divNumber2 + 100,结果为110.0
    println(result2)

    //非空断言运算符(!!)
    val divNumber3 = divide(100, 10)
    val result3 = divNumber1!!.plus(100)//divNumber1+100,结果为110.0
    println(result3)

    val divNumber4 = divide(100, 0)
//    val result4 = divNumber4!!.plus(100)//divNumber2+100,结果抛出异常

    //使用Elvis运算符(?:)
    val divNumber5 = divide(100, 0)
    val result5 = divNumber5?.plus(100) ?: 0
    println(result5)

    val divNumber6 = divide(100, 10)
    val result6 = divNumber6?.plus(100) ?: 0
    println(result6)
}

//声明除法运算函数  //Double? 问号说明可以返回空
fun divide(n1: Int, n2: Int): Double? {

    if(n2 == 0) {//判断分母是否为0
        return null
    }
    return n1.toDouble() / n2
}