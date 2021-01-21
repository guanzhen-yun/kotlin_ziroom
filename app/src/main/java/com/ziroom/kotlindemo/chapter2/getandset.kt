package com.ziroom.kotlindemo.chapter2

//get and set方法 属性引用
fun main(args: Array<String>) {
    val nameRef = People::name
    val p = People("张三")
    val nameRef2 = p::name
    nameRef2.set("李四")
}

class People(name: String) {
    var name: String = name
    get() {
        return field
    }

    set(value) {
        field = value
    }
}



