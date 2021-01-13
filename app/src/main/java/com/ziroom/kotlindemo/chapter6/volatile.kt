package com.ziroom.kotlindemo.chapter6

import kotlin.concurrent.thread

@Volatile
private var running = false
fun start() {
    running = true
    thread(start = true) {
        while (running) {
            println("Still running: ${Thread.currentThread()}")
        }
    }
}

fun stop() {
    running = false
    println("Stopped: ${Thread.currentThread()}")
}