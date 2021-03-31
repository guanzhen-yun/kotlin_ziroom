package com.ziroom.kotlindemo.chapter5.fanshe

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

/**
 *Author:关震
 *Date:2021/3/30 9:57
 *Description:anli_deepcopy_util 数据类实现DeepCopy
 * https://github.com/enbandari/KotlinDeepCopy
 **/

fun <T : Any> T.deepCopy(): T {
    if(!this::class.isData) {
        return this
    }

    return this::class.primaryConstructor!!.let {
        primaryConstructor ->
        primaryConstructor.parameters.map { parameter ->
            val value = (this::class as KClass<T>).memberProperties.first { it.name == parameter.name }
                .get(this)
            if((parameter.type.classifier as? KClass<*>) ?.isData == true) {
                parameter to value?.deepCopy()
            } else {
                parameter to value
            }
        }.toMap()
            .let(primaryConstructor::callBy)
    }
}