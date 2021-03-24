package com.example.kotlincode

/**
 *
 * @ProjectName:    KotlinCode
 * @Package:        com.example.kotlincode
 * @ClassName:      PassengerPlane
 * @Description:     java类作用描述
 * @Author:         lifeilei
 * @CreateDate:     1/20/21 9:47 AM
 * @UpdateUser:     更新者：
 * @UpdateDate:     1/20/21 9:47 AM
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class PassengerPlane : Plane() {
    override fun fly() {
        super.fly()
        println("PassengerPlane can fly")
    }

    fun carryPassenger(){
        println("PassengerPlane can carry more passenger")
    }
}