package com.ziroom.kotlindemo.chapter3

/**
 * 父类 想被继承必须标识open  不加val 则变量不能被使用
 * 抽象类或抽象方法不需要加open
 */
 open class ParentClass(val sex: String, val age: Int) {
    open fun getGender(): String {
        return "男"
    }

}