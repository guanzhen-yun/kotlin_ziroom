package com.ziroom.kotlindemo.chapter4.teshu

import java.io.File

//特殊函数

class PersonP(var name: String, var age: Int)

fun main() {
    val person = PersonP("benny", 20)

    person.let {

    }

    person.let(::println)

    person.run {
    }

    person.run(::println)

    val person2 = person.also {
        it.name = "hhh"
    }

    println(person2.name)

    val person3 = person.apply {
        name = "xxx"
    }

    println(person3.name)

    val result = with(person, {
        name = "yyy"
        "hello"
    })

    println(person.name)
    println(result)

    //reader自动close
    File("D:/KotlinDemo/app\\build.gradle.kts").inputStream().reader().buffered()
        .use {
            println(it.readLines())
        }
}