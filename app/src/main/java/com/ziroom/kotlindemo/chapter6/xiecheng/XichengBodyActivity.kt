package com.ziroom.kotlindemo.chapter6.xiecheng

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ziroom.kotlindemo.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * 协程体
 */
class XichengBodyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xiecheng)
        GlobalScope.launch {
            val token = getToken()
            val userInfo = getUserInfo(token)
            setUserInfo(userInfo)
        }

        repeat(8) {
            Log.e("XichengBodyActivity", "主线程执行$it")
        }
    }

    private fun setUserInfo(userInfo: String) {
        Log.e("XichengBodyActivity", userInfo)
    }

    //延时操作要加suspend关键字
    private suspend fun getToken(): String {
        delay(2000)
        return "token"
    }

    //协程挂起后不会阻塞其他线程的执行
    private suspend fun getUserInfo(token: String): String {
        delay(2000)
        return "$token - userInfo"
    }

}