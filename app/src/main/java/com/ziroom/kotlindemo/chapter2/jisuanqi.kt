package com.ziroom.kotlindemo.chapter2

import java.lang.Exception

/**
 * 计算器
 */

fun main(vararg args: String) {
    if (args.size < 3) {
        return showHelp()
    }
    val operators = mapOf(
        "+" to ::plus,
        "-" to ::minus,
        "*" to ::times,
        "/" to ::div
    )

    val op = args[1]
    val opFunc = operators[op] ?: return showHelp()

    try {
        println("Input: ${args.joinToString(" ")}")
        println("Output: ${opFunc(args[0].toInt(), args[2].toInt())}")
    } catch (e: Exception) {
        println("Invalid Arguments.")
        showHelp()
    }
}

fun plus(args0: Int, args1: Int): Int {
    return args0 + args1
}

fun minus(args0: Int, args1: Int): Int {
    return args0 - args1
}

fun times(args0: Int, args1: Int): Int {
    return args0 * args1
}

fun div(args0: Int, args1: Int): Int {
    return args0 / args1
}

fun showHelp() {
    println(
        """
            
        Simple Calculator:
        Input:3 * 4
        Output:12
        
    """.trimIndent()
    )
}