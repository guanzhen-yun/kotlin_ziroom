package com.ziroom.kotlindemo.chapter5.fanshe

import java.lang.reflect.ParameterizedType
import kotlin.reflect.full.allSupertypes

/**
 *Author:关震
 *Date:2021/3/29 16:38
 *Description:anli_fanx_shican 获取泛型实参
 * -keepattributes Signature  保留签名 防止反射获取不到实际参数类型(泛型擦除)
 **/

interface Api {
    fun getUsers(): List<UserDTO2>
}

abstract class SuperType<T> {
    val typeParameter by lazy {
       this::class.allSupertypes.first().arguments.first().type!!
    }

    val typeParameterJava by lazy {
        this.javaClass.genericSuperclass!!.safeAs<ParameterizedType>()!!.actualTypeArguments.first()
    }
}

open class SubType : SuperType<String>()

class SubType2 : SubType()

fun main() {
//    Api::class.declaredFunctions.first { it.name == "getUsers"}
//        .returnType.arguments.forEach {
//            println(it)
//        }

//    Api::getUsers.returnType.arguments.forEach {
//        println(it)
//    }

    Api::class.java.getDeclaredMethod("getUsers")
        .genericReturnType.safeAs<ParameterizedType>()?.actualTypeArguments?.forEach {
        println(it)
    }

    val subType = SubType()
    subType.typeParameter.let(::println)
    subType.typeParameterJava.let(::println)
}

fun <T> Any.safeAs(): T? {
    return this as? T
}
