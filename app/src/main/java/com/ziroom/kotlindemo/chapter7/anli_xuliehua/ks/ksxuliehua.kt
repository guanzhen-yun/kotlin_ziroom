package com.ziroom.kotlindemo.chapter7.anli_xuliehua.ks

import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

//Kotlinx.serialization

@Serializable
data class PersonS(val name: String, val age: Int)

@ImplicitReflectionSerializer
fun main() {
    println(Json(JsonConfiguration.Stable).stringify(PersonS.serializer(), PersonS("Benny Huo", 20)))
    println(Json(JsonConfiguration.Stable).parse(PersonS.serializer(), """{"name":"Benny Huo","age":20}"""))
}

//输出
//{"name":"Benny Huo","age":20}
//PersonS(name=Benny Huo, age=20)