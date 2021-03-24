package com.ziroom.kotlindemo.chapter7.xh

fun main() {
    val li = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
    li.forEachIndexed label1@ {index, it ->
        if(index == 1) return
        it.forEach label2@{
            if(it % 2 == 0) return@label2
            println(it)
        }
    }
}