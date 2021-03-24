package com.ziroom.kotlindemo.chapter2

//构造器添加val 或 var 说明增加一个属性
class Person(val name: String, val age: Int) {
    //自定义比较规则
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Person) {
            return false
        }
        return (name == other.name && age == other.age)
    }
}