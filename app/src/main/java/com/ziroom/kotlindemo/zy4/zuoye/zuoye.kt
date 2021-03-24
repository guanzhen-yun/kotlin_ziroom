package com.ziroom.kotlindemo.zy4.zuoye
//生产者消费者 https://blog.csdn.net/vitaviva/article/details/108556523
fun main() {
    val producer = Producer()
    val consumer = Consumer()
    for (i in 0 until TestPC.MAX_PRODUCER) {
        val threadA = Thread(producer, "生产者线程$i")
        threadA.start()
    }
    for (j in 0 until TestPC.MAX_CONSUMER) {
        val threadB = Thread(consumer, "消费者线程$j")
        threadB.start()
    }
}
