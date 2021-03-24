package com.ziroom.kotlindemo

//import com.ziroom.kotlindemo.chapter3.ChildClass
//import com.ziroom.kotlindemo.chapter3.firstChar
//import com.ziroom.kotlindemo.test.TestChildClass2

//fun main() {
//    println(getNum(7))
//    println(getNum2(7))
//
//    println("a2bcwerr".remove("ab"))
//
//    val myParentClass = TestParentClass1("飞")
//    println(myParentClass.fly)
//    myParentClass.fly()
//
//    val myChildClass = TestChildClass2("飞1", 100)
//    myChildClass.fly()
//    println(myChildClass.manned)
//}


fun getNum(n: Int): Int {
    if (n == 1 || n == 2) {
        return 1
    } else {
        return getNum(n - 1) + getNum(n - 2)
    }
}


fun getNum2(n: Int): Int {

    var a=1
    var b=1
    var num=0;

    if (n == 1 || n == 2) {
        return 1
    } else {
        for (i in 1..n-2){
            num=a+b
            a=b
            b=num
        }
        return num
    }
}


fun String.remove(s: String): String {
    if (this.length == 0) return ""
    return this.replace(s, "");
}

