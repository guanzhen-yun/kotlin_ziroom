package com.ziroom.kotlindemo.chapter5.fanshe

/**
 *Author:关震
 *Date:2021/3/29 17:42
 *Description:anli_deepcopy 数据类实现DeepCopy
 **/

data class Person(val id: Int, val name: String, val group: Group)

data class Group(val id: Int, val name: String, val location: String)

fun main() {
    val person = Person(
        0,
        "Bennyhuo",
        Group(
            0,
            "Kotliner.cn",
            "China"
        )
    )

    val copiedPerson = person.copy()
    val deepCopiedPerson = person.deepCopy()

    println(person === copiedPerson)
    println(person === deepCopiedPerson)

    println(person.group === copiedPerson.group)
    println(person.group === deepCopiedPerson.group)

    println(deepCopiedPerson)
}
