package com.ziroom.kotlindemo.chapter3

data class Student(var id: Long, var name: String, var age: Int, var score: Int) {
    override fun toString(): String {
        return "Student(id=$id, name=$name, age=$age, score=$score)"
    }
}
