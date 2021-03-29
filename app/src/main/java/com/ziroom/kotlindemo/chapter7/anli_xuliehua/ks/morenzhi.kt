package com.ziroom.kotlindemo.chapter7.anli_xuliehua.ks

import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

//Kotlinx.serialization 默认值

@Serializable
data class PersonWithDefaults(val name: String, val age: Int = 18)
@ImplicitReflectionSerializer
fun main() {
    println(Json(JsonConfiguration.Stable).stringify(PersonWithDefaults.serializer(), PersonWithDefaults("Benny Huo")))
    println(Json(JsonConfiguration.Stable).parse(PersonWithDefaults.serializer(), """{"name":"Benny Huo"}"""))
}
//{"name":"Benny Huo","age":18}
//PersonWithDefaults(name=Benny Huo, age=18)