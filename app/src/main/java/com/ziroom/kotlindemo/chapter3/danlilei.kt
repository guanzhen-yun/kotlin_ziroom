package com.ziroom.kotlindemo.chapter3

/**
 * 单例类 相当于java饿汉式单例
 */
object AA {
    const val m = "sss"
    fun getName(): String {
        return "名字"
    }

    @JvmStatic var x: Int = 2

    @JvmField var y: Int = 3  //生成静态的Field 没有get set 方法 public static int y

    @JvmStatic fun getGender() {

    }
}

fun main(args: Array<String>) {
    println(AA.m)
    println(AA.getName())
    println(AA.getGender())
    Foo.y() //伴生对象相当于java的静态成员
}
