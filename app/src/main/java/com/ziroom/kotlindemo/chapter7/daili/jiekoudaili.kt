package com.ziroom.kotlindemo.chapter7.daili
//接口代理
fun main() {
    val superArray = ApiWrapper2()
    superArray.c()
}

interface Api {
    fun a()
    fun b()
    fun c()
}

class ApiImpl : Api {
    override fun a() {
        println("aapi is called.")
    }

    override fun b() {
        println("bapi is called.")
    }

    override fun c() {
        println("capi is called.")
    }
}

//接口代理
class ApiWrapper(val api: Api): Api {
    override fun a() {
        api.a()
    }
    override fun b() {
        api.b()
    }
    override fun c() {
        println("c is called.")
        api.c()
    }
}

class ApiWrapper2(val api: Api = ApiImpl()): Api by api {
    //对象api 代替类ApiWrapper2实现接口Api
    //对于对象api的唯一要求就是实现被代理的接口
    override fun c() {
        println("c is called.")
        api.c()
    }
}