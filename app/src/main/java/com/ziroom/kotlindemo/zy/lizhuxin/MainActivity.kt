package com.example.kotlindemo

fun main(args: Array<String>) {
//    recursion(3)
//    noRecursion(3)
    println("a1b2c3".removeChar())
}

private fun recursion(a: Int): Int {
    if (a >= 3) {
        return recursion(a - 1) + recursion(a - 2)
    }
    return 1
}

private fun noRecursion(n: Int): Int {
    var a = n
    var a1 = 1
    var a2 = 1
    var a3 = 0
    if (a <= 2)
        return 1
    else {
        while (a > 2) {
            a3 = a1 + a2
            a1 = a2
            a2 = a3
            a--
        }
    }
    return a3;
}



fun String.removeChar(): String {
    return this.replace(Regex("[abc]"), "")
}


open class Aircraft {
    fun fly() {
        println("我会飞")
    }
}

class Airliner : Aircraft() {
    fun manned() {
        println("我可以载人")
    }

}

class Bomber : Aircraft() {
    fun emission() {
        println("我可以炸人")
    }


}

fun changelist(): MutableList<Int> {
    val mutList = mutableListOf<Int>(1, 3, 5, 7, 9)
    mutList[0] = 19
    mutList[1] = 15
    mutList[2] = 11
    mutList[3] = 7
    mutList[4] = 3
    return mutList
}