package com.ziroom.kotlindemo

/**
 * 父类 想被继承必须标识open
 */
open class TestParentClass1(val fly: String) {
   open fun fly(){
       print("可以飞")
   }

}