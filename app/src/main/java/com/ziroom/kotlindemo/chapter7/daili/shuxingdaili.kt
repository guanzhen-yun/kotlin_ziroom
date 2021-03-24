package com.ziroom.kotlindemo.chapter7.daili

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

//属性代理
fun main() {
    val stateManager = StateManager()
    stateManager.state = 3
    stateManager.state = 4

    println(Foo().x)
}

//lazy 返回的对象代理了属性 firstName 的getter
class Person(val name: String) {
    val firstName by lazy { name.split(" ")[0] }
}

//observable

class StateManager {
    //ObservableProperty的实例代理了属性state 的getter/setter
    var state: Int by Delegates.observable(0) { property, oldValue, newValue ->
        println("State changed from $oldValue -> $newValue")
    }
}

class Foo {
    val x: Int by X()

    var y: Int by X()
}

class X {
    operator fun getValue(thisRef: Any?, property: KProperty<*>):Int {
        return 2
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, i:Int) {

    }
}