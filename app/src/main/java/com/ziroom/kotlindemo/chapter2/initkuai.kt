package com.ziroom.kotlindemo.chapter2

/**
 * init块
 */
fun main() {

}

//age 属性  name普通变量
class MPerson(val age: Int, name: String) {
    var name: String //属性
    val firstName: String //属性必须初始化
    //    init块可以有多个 最终会合并执行
    init {
        this.name = name
        this.firstName = name.split(" ")[0]
    }

    init {}
}