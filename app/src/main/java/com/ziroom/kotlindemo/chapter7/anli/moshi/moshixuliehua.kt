package com.ziroom.kotlindemo.chapter7.anli.moshi

import com.squareup.moshi.Moshi

//Moshi

data class PersonMoshi(val name: String, val age: Int)

fun main() {
    val moshi = Moshi.Builder().build()
    val jsonAdapter = moshi.adapter(PersonMoshi::class.java)
    println(jsonAdapter.toJson(PersonMoshi("Benny Huo", 20)))
    println(jsonAdapter.fromJson("""{"name":"Benny Huo","age":20}"""))
}

//输出
//{"age":20,"name":"Benny Huo"}
//PersonMoshi(name=Benny Huo, age=20)