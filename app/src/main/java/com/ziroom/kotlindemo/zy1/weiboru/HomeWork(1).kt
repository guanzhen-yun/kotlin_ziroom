package com.housekeeper.management

class HomeWork {
}

//f(10)
fun main(args: Array<String>) {
    var temp = 0
    for (i in 1..9) {
        print((i + temp).toString() + ",")
        temp += i
    }
}

fun String.exclude(): String {
    return this.filter { it != 'a' && it != 'b' && it != 'c' }
}

open class feiji {
    open fun fly() {
        println("feifeifei")
    }
}

class zairenfeiji : feiji() {
    fun lahenduoren(){}

    override fun fly() {
        println("lalala")
        super.fly()
    }
}

class hongzhaji : feiji() {
    fun fashedaodan(){}
    override fun fly() {
        println("zhazhazha")
        super.fly()
    }
}

