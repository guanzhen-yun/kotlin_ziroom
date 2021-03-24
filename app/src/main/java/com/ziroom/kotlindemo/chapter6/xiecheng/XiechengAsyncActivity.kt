package com.ziroom.kotlindemo.chapter6.xiecheng

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ziroom.kotlindemo.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//async

class XiechengAsyncActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xiecheng)
        //async是不阻塞线程的
        GlobalScope.launch {
            val result1 = GlobalScope.async {
                getResult1()
            }

            val result2 = GlobalScope.async {
                getResult2()
            }

            val result = result1.await() + result2.await()
            Log.e("XiechengAsyncActivity", "result = $result")
        }

    }

    private suspend fun getResult1(): Int {
        delay(3000)
        return 1
    }

    private suspend fun getResult2(): Int {
        delay(4000)
        return 2
    }
}