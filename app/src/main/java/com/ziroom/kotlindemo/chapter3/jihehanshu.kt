package com.ziroom.kotlindemo.chapter3

//集合的几个函数
fun main(args: Array<String>) {
    //映射函数
    val list = listOf(1, 2, 3, 4, 5)
    val list3 = list.asSequence().map { it * it} //asSequence 懒序列
    println(list3) //TransformingSequence
    list.flatMap { 0 until it }.joinToString().let(::println) //[0, 0, 1, 0, 1, 2, 0, 1, 2, 3, 0, 1, 2, 3, 4]
    val list2 = list.map { it * it }
    println(list2)  //平方 [1, 4, 9, 16, 25]

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