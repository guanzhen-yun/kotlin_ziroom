package com.ziroom.kotlindemo.chapter5.fanshe

import java.lang.IllegalStateException
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty0
import kotlin.reflect.jvm.isAccessible

/**
 *Author:关震
 *Date:2021/3/30 15:20
 *Description:anli_bukekong 可释放对象应用的不可空类型
 * https://github.com/enbandari/ReleasableVar
 **/

fun <T : Any> releasableNotNull() = ReleasableNotNull<T>()

class ReleasableNotNull<T : Any> : ReadWriteProperty<Any, T> {
    private var value: T? = null

    override fun getValue(thisRef: Any, property: KProperty<*>): T {
        return value ?: throw IllegalStateException("Not initialized or released already.")
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        this.value = value
    }

    fun isInitialized() = value != null

    fun release() {
        value = null
    }
}

inline val KProperty0<*>.isInitialized: Boolean
   get() {
       isAccessible = true
       return (this.getDelegate() as? ReleasableNotNull<*>)?.isInitialized()
           ?: throw IllegalAccessException("Delegate is not an instance of ReleasableNotNull or is null.")
   }

fun KProperty0<*>.release() {
    isAccessible = true
    (this.getDelegate() as? ReleasableNotNull<*>)?.release()
        ?: throw IllegalAccessException("Delegate is not an instance of ReleasableNotNull or is null.")
}

class Bitmap(val width: Int, val height: Int)

class Activity {
    private var bitmap by releasableNotNull<Bitmap>()

    fun onCreate() {
        println(::bitmap.isInitialized)
        bitmap = Bitmap(1920, 1080)
        println(::bitmap.isInitialized)
    }

    fun onDestroy() {
        println(::bitmap.isInitialized)
        ::bitmap.release()
        println(::bitmap.isInitialized)
    }
}

fun main() {
    val activity = Activity()
    activity.onCreate()
    activity.onDestroy()
}
