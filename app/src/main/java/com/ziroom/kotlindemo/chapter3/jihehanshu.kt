package com.ziroom.kotlindemo.chapter3

//集合的几个函数
fun main(args: Array<String>) {
    //映射函数
    val list = listOf(1, 2, 3, 4, 5)
    val list2 = list.map { it * it }
    println(list2)  //平方

    val strList = listOf("a", "b", "c")
    val strList2 = strList.map { listOf(it + 1, it + 2, it + 3, it + 4) }  //嵌套
    println(strList2)
    val strList3 = strList2.flatten()  //平铺
    println(strList3)

    val strList4 = strList.flatMap { listOf(it + 1, it + 2, it + 3, it + 4) }  //嵌套平铺
    println(strList4)

    //过滤
    val studentList = listOf(
        Student(1, "Jack", 18, 90),
        Student(2, "Rose", 17, 80),
        Student(3, "Alice", 16, 70)
    )

    val studentList2 = studentList.filter { it.age >= 18 }
    println(studentList2)

    //排序
    val mList = listOf(1, 5, 7, 3, 4)
    println(mList.sorted())//排序
    println(mList.reversed()) //反转

    //去重
    val dupList = listOf(1, 1, 2, 2, 3, 3, 3)
    println(dupList.distinct())
}