package com.example.kotlincode

/**
 *
 * @ProjectName:    KotlinCode
 * @Package:        com.example.kotlincode
 * @ClassName:      BomberPlane
 * @Description:     java类作用描述
 * @Author:         lifeilei
 * @CreateDate:     1/20/21 9:52 AM
 * @UpdateUser:     更新者：
 * @UpdateDate:     1/20/21 9:52 AM
 * @UpdateRemark:   更新说明：
 * @Version:        1.0
 */
class BomberPlane : Plane() {
    override fun fly() {
        super.fly()
        println("Bomber can fly")
    }

    fun launchGuidedMissile(){
        println("BomberPlane can launch guid missile")
    }
}