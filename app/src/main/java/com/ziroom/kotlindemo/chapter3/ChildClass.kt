package com.ziroom.kotlindemo.chapter3

class ChildClass(sex: String, age: Int = 12, override val score: Float) : ParentClass(sex, age), Jiekou, Jiekou2 {
    override fun getGender(): String {
        return "女"
    }

    override fun getName(): String {
        return ""
    }


}