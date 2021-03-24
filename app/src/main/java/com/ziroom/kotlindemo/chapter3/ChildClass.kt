package com.ziroom.kotlindemo.chapter3

//override val score: Float 重写构造方法的参数  或者重写在class类里面
class ChildClass(sex: String, age: Int = 12, override val score: Float) : ParentClass(sex, age), Jiekou, Jiekou2 {
    override fun getGender(): String {
        return "女"
    }

    override fun getName(): String {
        return ""
    }

//    override val score: Float
//        get() {
//            return 10.0f
//        }


}