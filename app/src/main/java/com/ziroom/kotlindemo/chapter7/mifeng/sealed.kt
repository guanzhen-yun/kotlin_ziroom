package com.ziroom.kotlindemo.chapter7.mifeng

//密封类
//1.抽象
//2.密封

sealed class PlayerState {
    //构造器私有
    constructor()

    constructor(int: Int)
}

//密封类子类

object Idle : PlayerState()
class Playing(val song: Song) : PlayerState() {
    fun start() {}
    fun stop() {}
}

class Error(val errorInfo: ErrorInfo) : PlayerState() {
    fun recorver() {}
}

class Player {
    var state: PlayerState = Idle

    //子类分支
    fun play(song: Song) {
        this.state = when (val state = this.state) {
            Idle -> {
                Playing(song).also { Playing::start }
            }
            is Playing -> {
                state.stop()
                Playing(song).also { Playing::start }
            }
            is Error -> {
                state.recorver()
                Playing(song).also { Playing::start }
            }
        }
    }
}

fun main() {
    val player = Player()
    player.play(Song.A)
}

enum class Song {
    A, B
}

class ErrorInfo