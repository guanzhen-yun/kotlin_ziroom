package com.ziroom.kotlindemo.chapter2.yanchi

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.ziroom.kotlindemo.R

//解法一 初始化为null
class YanshiKtActivity : Activity() {
    private var tvNameview: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yanshi)
        tvNameview = findViewById(R.id.tv_nameview)
        tvNameview?.text = "Benny"
    }
}