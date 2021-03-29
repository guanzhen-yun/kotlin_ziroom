package com.ziroom.kotlindemo.chapter7.anli_xuliehua.moshi

import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi

//Moshi 默认值

@JsonClass(generateAdapter = true)  //注解处理器
data class PersonWithDefaults(val name: String, val age: Int = 18)

fun main() {
    val moshi = Moshi.Builder()
        //.add(KotlinJsonAdapterFactory()) //implementation("com.squareup.moshi:moshi-kotlin:1.8.0")  反射库
        .build()
    val jsonAdapter = moshi.adapter(PersonWithDefaults::class.java)
    println(jsonAdapter.toJson(PersonWithDefaults("Benny Huo")))
    println(jsonAdapter.fromJson("""{"name":"Benny Huo"}"""))
}

//output
//{"name":"Benny Huo","age":18}
//PersonWithDefaults(name=Benny Huo, age=18)

