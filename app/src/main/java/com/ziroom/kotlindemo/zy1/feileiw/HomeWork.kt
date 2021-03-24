package com.example.kotlincode

/**
 *
 * @ProjectName:    KotlinCode
 * @Package:        com.example.kotlincode
 * @ClassName:      HomeWork
 * @Description:     java类作用描述
 * @Author:         lifeilei
 * @CreateDate:     1/20/21 9:43 AM
 * @UpdateUser:     更新者：
 * @UpdateDate:     1/20/21 9:43 AM
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class HomeWork {

}

fun main(args: Array<String>) {

    //飞机相关
    createPlane()
    //扩展函数
    expendFun()
    //集合
    listExp()

    val fibonacciA = fibonacciA(2)
    println(fibonacciA)
    val fibonacciB = fibonacciB(2);
    println(fibonacciB)
}

private fun createPlane() {
    val bomber = BomberPlane()
    bomber.fly()
    bomber.launchGuidedMissile()

    val passenger = PassengerPlane()
    passenger.fly()
    passenger.carryPassenger()
}

private fun expendFun() {
    val str = "36a7bd"
    println("过滤后的字符串为${str.filterLetter()}")
}

/**
 * 过滤字母的字符串扩展函数
 */
fun String.filterLetter(): String {
    return filter { !it.isLetter() }
}

private fun listExp() {
    val list = mutableListOf<Int>(1, 3, 5, 7, 9)
    val map = list.map {
        it * 2 + 1
    }
    val reversed = map.reversed();
    println(reversed)
}

/**
 * 斐波那契额数列
 *
 * @param n 一共生成n个大小的数列
 */
fun fibonacciA(n: Int): MutableList<Int> {
    var sum = 0
    var j = 1
    var k = 1
    val list = mutableListOf<Int>()

    if (n == 1){
        list.add(j)
        return list
    }

    list.add(j)
    list.add(k)

    while (sum < n - 2) {
        val temp = j + k
        list.add(temp)

        j = k
        k = temp
        sum++
    }
    return list
}

/**
 * 斐波那契额数列
 *
 * @param n 长度
 *
 * @return
 */
fun fibonacciB(n: Int): MutableList<Int> {
    var sum = 0
    val list = mutableListOf<Int>()
    while (sum < n){
        list.add(fn(n - sum))
        sum ++
    }
    list.reverse()
    return list
}

fun fn(n: Int): Int {
    if (n == 1 || n == 2) {
        return 1
    }
    return fn(n - 1) + fn(n - 2)
}
