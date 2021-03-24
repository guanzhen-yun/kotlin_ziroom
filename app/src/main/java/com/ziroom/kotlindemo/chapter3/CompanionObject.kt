package com.ziroom.kotlindemo.chapter3
//伴生对象 kotlin中没有静态的概念 可以通过注解@JvmStatic实现

class Foo {
    companion object {
        @JvmStatic fun y(){}  //静态方法 相当于java public static void y(){}

        fun z(){}  //静态方法
    }

    @JvmField var x: Int = 2 //生成非静态的Field 没有get set 方法 public int x = 2;

    fun w() {

    }
}