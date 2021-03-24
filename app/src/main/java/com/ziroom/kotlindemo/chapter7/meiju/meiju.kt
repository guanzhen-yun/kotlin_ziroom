package com.ziroom.kotlindemo.chapter7.meiju

//枚举 不可以继承其他类

//可以实现接口
enum class State : Runnable {
    Idle, Busy {
        override fun run() {
            println("For Busy State.")
        }
    };

    override fun run() {
        println("For Every State.")
    }
}

//可以设置构造函数
enum class State1(val id: Int) {
    Idle(0), Busy(1)
}

//单独实现接口
enum class State2 : Runnable {
    Idle {
        override fun run() {

        }
    },
    Busy {
        override fun run() {

        }
    }
}

fun main() {
    State.Busy.name
    State.Busy.ordinal
    State1.Busy.id
    State.Idle.run()
    State.Busy.run()
    println(State.Busy.next().name)
    println(getState(State.Busy))

    val colorRange = Color.White..Color.Green
    val color = Color.Blue
    color in colorRange //false
}

//条件分支
fun getState(state: State): Int {
    val value = when (state) {
        State.Idle -> {
            0
        }
        State.Busy -> {
            1
        }
    }
    return value
}

//枚举定义扩展
fun State.next(): State {
    return State.values().let {
        val nextOrdinal = (ordinal + 1) % it.size
        it[nextOrdinal]
    }
}

//枚举比较
fun compare() {
    val state: State = State.Busy
    if(state <= State.Idle) {

    } else{

    }
}

//区间
enum class Color {
    White, Red, Green, Blue, Yellow, Black
}


