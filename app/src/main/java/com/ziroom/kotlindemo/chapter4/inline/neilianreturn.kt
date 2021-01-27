package com.ziroom.kotlindemo.chapter4.inline
//内联函数return
fun main() {
    val ints = intArrayOf(1, 2, 3, 4)

    val ints1 = listOf(ints, ints)

    ints1.forEach {
        it.forEach {
            if(it == 3) {
                return  //local return
            }
            println("Hello $it")
        }
    }

//    ints.forEach {
//        if(it == 3) return@forEach  //local return
//        println("Hello $it")
//    }
    //最终结果 1 2 4 和 continue等价
    //如果不加@forEach  会返回 1 2
}