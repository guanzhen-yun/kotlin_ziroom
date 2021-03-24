package com.ziroom.kotlindemo.zy1.zuoye

/**
 * 飞机
 * 写一个继承相关的实现载人飞机和轰炸机的对象  共同点都能飞 区别 载人飞机可以拉很多乘客 轰炸机可以发射导弹
 */
fun main(args: Array<String>) {
    val p1 = PlaneLoadPerson()
    val p2 = PlaneWithBoom()
    p1.canFly()
    p1.loadManyPeople()

    p2.canFly()
    p2.launchMissile()
}

abstract class Plane {
    open fun canFly() {
        println("我可以飞")
    }
}

class PlaneLoadPerson : Plane() {
    override fun canFly() {
        println("载人飞机: 我可以飞")
    }
    fun loadManyPeople() {
        println("可以拉很多乘客")
    }
}

class PlaneWithBoom : Plane() {
    override fun canFly() {
        println("轰炸机: 我可以飞")
    }
    fun launchMissile() {
        println("发射导弹")
    }
}