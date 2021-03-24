package com.ziroom.kotlindemo.chapter4.sam

fun main() {
    val eventManager = EventManager()

    //正确的写法 匿名内部类
    val onEvent = object : EventManager.OnEventListener {
        override fun onEvent(event: Int) {
            println("onEvent $event")
        }
    }

    //或
    val onEvent2 = EventManager.OnEventListener { event ->
        println("onEvent $event")
    }

    eventManager.addOnEventListener(onEvent)  //onEvent 应该是对象 而不应该是Lambda表达式

    eventManager.removeOnEventListener(onEvent)

    //错误写法

//    eventManager.addOnEventListener {
//        println("onEvent $it")
//    }
//
//    eventManager.removeOnEventListener {
//        println("onEvent $it")
//    }
}