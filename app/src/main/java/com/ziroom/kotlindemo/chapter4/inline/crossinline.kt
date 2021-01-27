package com.ziroom.kotlindemo.chapter4.inline

//crossinline 和 noinline
fun main() {
    Runnable {
//        return  block禁止 non-local return
    }

//    Runnable2 {
//        return  block禁止 non-local return
//    }
}

//block禁止 non-local return
inline fun Runnable(crossinline block: () -> Unit): Runnable {
    return object : Runnable {
        override fun run() {
            block() //有可能存在不合法的 non-local return  (如果return 是退出run())
            //因为block调用处和定义处不在同一个调用上下文
        }
    }
}

//inline 失去内联的作用了
inline fun Runnable2(noinline block: () -> Unit): Runnable {
    return object : Runnable {
        override fun run() {
            block() //有可能存在不合法的 non-local return  (如果return 是退出run())
            //因为block调用处和定义处不在同一个调用上下文
        }
    }
}

