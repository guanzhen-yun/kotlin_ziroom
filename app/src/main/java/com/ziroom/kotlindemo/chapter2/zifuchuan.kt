package com.ziroom.kotlindemo.chapter2

/**
 *字符串
 */
fun main(args: Array<String>) {
    //原始字符串  """ """
    val s4 = "Hello\nWorld"
    val s5 = """Hello
World"""
    println(s4 == s5)//输出结果为true

    val s6 = """Hello\nWorld"""
    println(s6)  //Hello\nWorld


    //字符串转换
    val chars = charArrayOf('a', 'b', 'c', 'd', 'e')
    val s1 = String(chars)
    val s2 = String(chars, 1, 4)
    println(s1)
    println(s2)

    val bytes = byteArrayOf(97, 98, 99)
    val s3 = String(bytes) //ASCII abc
    val s7 = String(bytes, 1, 2)
    println(s3)
    println(s7)

    //字符串模板
    val age = 18
    val ageStr = "她的年龄是${age}岁。" //使用表达式形式模板
    println(ageStr)

    val score = 'A'
    val scoreStr = "她的英语成绩是$score" //使用变量形式模板
    println(scoreStr)

    //正则表达式
    val pattern = """^([0-9a-zA-Z]([-.\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\w]*[0-9a-zA-Z]\.)+[a-zA-Z]{2,9})${'$'}"""
    val string = "eoreint@sina.com"
    val regex = Regex(pattern)
    println(regex.matches(string))

    val string1 = "AB12CD34EF"
    val regex1 = Regex("""\d+""")

    val result = regex1.find(string1)
    println(result?.value) //安全调用

    regex1.findAll(string1).forEach { e ->
        println(e.value)
    }

    //java中的正则
    //String content = "I am noob " + "from runoob.com.";
    //String pattern = ".*runoob.*";
    //boolean isMatch = Pattern.matches(pattern, content);

    val p1 = Person("Tony", 18)
    val p2 = Person("Tony", 18)
    val p3 = p1

    println(p1 == p2)
    println(p1.equals(p2))
    println(p1 === p2)
    println(p1 === p3)

}