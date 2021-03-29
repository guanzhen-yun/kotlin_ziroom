package com.ziroom.kotlindemo.chapter7.anli_xuliehua.ks

import kotlinx.serialization.*
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration

//Kotlinx.serialization init

@Serializable
data class PersonWithInits(val name: String, val age: Int) {
    val firstName by lazy {
        name.split(" ")[0]
    }

    @Transient  //transient关键字标记的成员变量不参与序列化过程
    val lastName = name.split(" ")[1]
}
@ImplicitReflectionSerializer
fun main() {
    println(Json(JsonConfiguration.Stable).stringify(PersonWithInits.serializer(), PersonWithInits("Benny Huo", 18)))
    val personWithInits = Json(JsonConfiguration.Stable).parse(PersonWithInits.serializer(), """{"name":"Benny Huo", "age":20}""")
    println(personWithInits.firstName)
    println(personWithInits.lastName)
}

//output
//{"name":"Benny Huo","age":18}
//Benny
//Huo