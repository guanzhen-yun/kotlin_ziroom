package com.ziroom.kotlindemo.chapter7.anli_xuliehua.moshi

import com.squareup.moshi.JsonClass
import com.squareup.moshi.Moshi

//Moshi init

@JsonClass(generateAdapter = true)  //注解处理器
data class PersonWithInits(val name: String, val age: Int) {
    val firstName by lazy {
        name.split(" ")[0]
    }

    @Transient  //transient关键字标记的成员变量不参与序列化过程
    val lastName = name.split(" ")[1]
}

fun main() {
    val moshi = Moshi.Builder()
        //.add(KotlinJsonAdapterFactory()) //implementation("com.squareup.moshi:moshi-kotlin:1.8.0")  反射库
        .build()
    val jsonAdapter = moshi.adapter(PersonWithInits::class.java)
    println(jsonAdapter.toJson(PersonWithInits("Benny Huo", 18)))
    val personWithInits = jsonAdapter.fromJson("""{"name":"Benny Huo", "age":20, "lastName":"Secrete"}""")
    println(personWithInits?.firstName)
    println(personWithInits?.lastName)
}

//output
//{"name":"Benny Huo","age":18}
//Benny
//Huo