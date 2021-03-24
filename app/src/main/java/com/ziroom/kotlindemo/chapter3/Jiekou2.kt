package com.ziroom.kotlindemo.chapter3

interface Jiekou2 {
    fun getName(): String {
        return "张三" //默认实现
    }

    val className: String
        get() {
            return "1"
        }
}