package com.ziroom.kotlindemo.chapter7.neilian

//枚举开销大
enum class RouteTypeEnum {
    WALK,
    BUS,
    CAR
}

fun setRouteType(@RouteTypeDef routeType: Int){}

fun setRouteType(routeType: RouteTypeInline){}

fun main() {
    //IntDef在KotLin中不生效？？ 新版本也支持了
    setRouteType(RouteTypeInt.WALK)


    setRouteType(RouteTypes.WALK)
}

//编译后拆箱为整型，降低内存开销
inline class RouteTypeInline(val value: Int)

object RouteTypes {
    val WALK = RouteTypeInline(0)
    val BUS = RouteTypeInline(1)
    val CAR = RouteTypeInline(2)
}
