package com.ziroom.kotlindemo.chapter6.xiecheng

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ziroom.kotlindemo.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class XiechengActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xiecheng)
        Log.e("XiechengActivity", "主线程id: ${mainLooper.thread.id}")
        launch()
        Log.e("XiechengActivity","主线程执行结束")
    }

    fun launch() {
        val job = GlobalScope.launch {
            delay(1000)
            Log.e("XiechengActivity","协程执行结束:--线程id: ${Thread.currentThread().id}")
        }
        println(job.isActive)

//job的方法
//    job.isActive
//    job.isCancelled
//    job.isCompleted
//    job.cancel()
//    job.join()

    }
}