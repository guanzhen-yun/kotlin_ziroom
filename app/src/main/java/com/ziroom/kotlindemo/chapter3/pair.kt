package com.ziroom.kotlindemo.chapter3

//pair And Triple
fun main(args: Array<String>) {
    //两种创建方式
    val pair = "Hello" to "Kotlin"
    val pair2 = Pair("Hello", "Kotlin")

    val first = pair.first
    val second = pair.second

//    val (x, y) = pair //解构

    val four: Four = Four(1,2)
    val (x, y) = four
    println("x=$x, y=$y")
}

class Four(var i: Int, var j: Int) {
    operator fun component1() = i

    operator fun component2() = j

}