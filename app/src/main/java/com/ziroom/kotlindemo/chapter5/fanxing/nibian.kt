package com.ziroom.kotlindemo.chapter5.fanxing

/**
 *Author:关震
 *Date:2021/3/26 16:09
 *Description:nibian 逆变
 **/

open class Waste

class DryWaste : Waste()

class Dustbin<in T: Waste> {
    fun put(t: T) {

    }
}

fun contravariant() {
    val dustbin: Dustbin<Waste> = Dustbin<Waste>()
    val dryWasteDustbin: Dustbin<DryWaste> = dustbin

    val waste = Waste()
    val dryWaste = DryWaste()

    dustbin.put(waste)
    dustbin.put(dryWaste)

//    dryWasteDustbin.put(waste)
    dryWasteDustbin.put(dryWaste)
}