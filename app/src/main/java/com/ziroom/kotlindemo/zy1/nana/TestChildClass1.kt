package com.ziroom.kotlindemo

class TestChildClass1(fly:String="",val manned:String) :TestParentClass1(fly){
    override fun fly() {
        super.fly()
        print("可以载人")
    }
}