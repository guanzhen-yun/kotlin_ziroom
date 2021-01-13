package com.ziroom.kotlindemo.chapter4

//高阶函数
fun main(args: Array<String>) {
    //需求  过滤出字符串长度是奇数的列表
    val strList = listOf("a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg")
    println(strList.filter { it.length % 2 == 1 })

    //拆解
    //1.判断输入的Int是否为奇数
    val f = fun(x: Int) = x % 2 == 1

    //2.返回输入的字符串参数的长度
    val g = fun(s: String) = s.length

    //表示形参是两个Lambda  返回参数类型为lambda
    val h1 = fun(g: (String) -> Int, f: (Int) -> Boolean): (String) -> Boolean {
        return { f(g(it)) }
    }

    //改良
    val h = fun(g: G, f: F): H {
        return { f(g(it)) }
    }
    println(strList.filter(h(g, f)))
}

//改良
typealias G = (String) -> Int
typealias F = (Int) -> Boolean
typealias H = (String) -> Boolean