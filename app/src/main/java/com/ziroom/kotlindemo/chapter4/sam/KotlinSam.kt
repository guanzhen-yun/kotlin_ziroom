package com.ziroom.kotlindemo.chapter4.sam

fun main() {
    //kotlin接口不可SAM转换
//    submit {
//
//    }

//    submitRunnable {
//
//    }

    submit2 {

    }
}

fun submitRunnable(runnable: Runnable) {//java接口
    runnable.run()
}

fun submit(invokable: Invokable) {
    invokable.invoke()
}

typealias FunctionX = () -> Unit

fun submit2(lambda: FunctionX) {

}

interface Invokable {
    fun invoke()
}
