package com.ziroom.kotlindemo.chapter2.yanchi

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.ziroom.kotlindemo.R

//解法三 使用lazy 只有在nameView首次被访问时执行
class YanshiKt3Activity : Activity() {
    private val tvNameview by lazy {
        findViewById<TextView>(R.id.tv_nameview)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yanshi)
    }
}