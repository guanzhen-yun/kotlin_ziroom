package com.ziroom.kotlindemo.chapter6.io

import java.io.File
import java.io.IOException
import java.lang.Exception

//文件树
fun main(args: Array<String>) {
    traverseFileTree("D:/KotlinDemo/app/src/main/java")
}

//遍历指定文件夹下的所有文件
fun traverseFileTree(filename: String) {
    val f = File(filename)
    val fileTreeWalk = f.walk()
    fileTreeWalk.iterator().forEach {
        println(it.absolutePath)
    }
}

fun getFileIterator(filename: String): Iterator<File> {
    val f = File(filename)
    val fileTreeWalk = f.walk()
    return fileTreeWalk.iterator()
}

//根据条件过滤
fun getFileSequenceBy(filename: String, p: (File) -> Boolean): Sequence<File> {
    val f = File(filename)
    return f.walk().filter(p)
}

//文件copy destName目标文件  srcName源文件
fun copyFile(destName: String, srcName: String) {
    val destFile = File(destName)
    val srcFile = File(srcName)
    destFile.copyRecursively(srcFile, true)
//    destFile.copyRecursively(srcFile, true, { f, e -> OnErrorAction.SKIP })
}