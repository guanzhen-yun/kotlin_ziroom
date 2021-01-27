package com.ziroom.kotlindemo.chapter4.inline

//内联属性
fun main() {
    val p = P()
    p.money = 5.0
    println(p.pocket)
}

class P {
    var pocket: Double = 0.0
    var money: Double //不可以赋值  no backing field
        inline get() = pocket
        inline set(value) {
            pocket = value
        }
}



