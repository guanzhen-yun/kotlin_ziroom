package com.ziroom.kotlindemo.chapter3

/**
 * 父类 想被继承必须标识open
 */
open class ParentClass(val name: String, val age: Int) {
    open fun getGender(): String {
        return "男"
    }

}