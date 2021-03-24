package com.ziroom.kotlindemo.chapter2.yanchi

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.ziroom.kotlindemo.R

//解法二 使用lateinit
class YanshiKt2Activity : Activity() {
    private lateinit var tvNameview: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yanshi)
        if(::tvNameview.isInitialized) {
            tvNameview = findViewById(R.id.tv_nameview)
        }
        tvNameview.text = "Benny"
    }
}