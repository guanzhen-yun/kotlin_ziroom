package com.ziroom.kotlindemo.chapter5.fanxing

import com.ziroom.kotlindemo.chapter7.anli_digui.IntList

/**
 *Author:关震
 *Date:2021/3/26 11:26
 *Description:digui 递归
 **/

fun main() {
    val max: String = maxOf<String>("Hello", "World")

    //val list = List.Cons(1.0, List.Nil)
}

fun <T> maxOf(a: T, b: T): T {
    TODO()
}

sealed class List<T> {
    object Nil: List<Nothing>() {
        override fun toString(): String {
            return "Nil"
        }
    }

    data class Cons<E>(val head: E, val tail: List<E>): List<E>() {
        override fun toString(): String {
            return "$head, $tail"
        }
    }

    fun joinToString(sep: Char = ','): String {
        return when(this) {
            Nil -> "Nil"
            is Cons -> {
                "${head}$sep${tail.joinToString(sep)}"
            }
        }
    }
}