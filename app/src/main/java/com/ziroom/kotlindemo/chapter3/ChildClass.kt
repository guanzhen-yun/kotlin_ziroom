package com.ziroom.kotlindemo.chapter3

class ChildClass(name: String, age: Int = 12) : ParentClass(name, age) {
    override fun getGender(): String {
        return "女"
    }
}