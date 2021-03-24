package com.ziroom.kotlindemo.chapter7.anli.gson

import com.google.gson.Gson

//Gson 默认值

data class PersonWithDefaults(val name: String, val age: Int = 18)

fun main() {
    val gson = Gson()
    println(gson.toJson(PersonWithDefaults("Benny Huo")))
    println(gson.fromJson("""{"name":"Benny Huo"}""", PersonWithDefaults::class.java))  //UnSafe
}

//output
//{"name":"Benny Huo","age":18}
//PersonWithDefaults(name=Benny Huo, age=0)