package com.ziroom.kotlindemo.chapter4.inline
//non --local return
fun main() {
    nonLocalReturn {
        return //相当于退出main()
    }
}

inline fun nonLocalReturn(block: ()-> Unit) {
    block()
}

