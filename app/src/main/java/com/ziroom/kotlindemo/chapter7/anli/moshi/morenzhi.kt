package com.ziroom.kotlindemo.chapter7.anli.moshi

import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi

//Moshi 默认值

@JsonClass(generateAdapter = true)
data class PersonWithDefaults(val name: String, val age: Int = 18)

fun main() {
    val moshi = Moshi.Builder().build()
    val jsonAdapter = moshi.adapter(PersonWithDefaults::class.java)
    println(jsonAdapter.toJson(PersonWithDefaults("Benny Huo")))
    println(jsonAdapter.fromJson("""{"name":"Benny Huo"}"""))
}

//output
//{"age":18,"name":"Benny Huo"}
//PersonWithDefaults(name=Benny Huo, age=0)

