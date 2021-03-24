package com.ziroom.kotlindemo.nana

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ziroom.kotlindemo.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import kotlin.collections.List as List1

//async



class NanaTestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xiecheng)

        GlobalScope.launch {
            val result1 = GlobalScope.async {
                produce()
            }

            consumer(result1.await())
        }

    }

    fun consumer(mList: MutableList<Int>) {
        for (i in 0 until mList.size)
        Log.e("Xiecheng---", mList[i].toString())


    }

    private suspend fun produce(): MutableList<Int> {
        delay(1000)
        val mList = mutableListOf(0)
        for (i in 1..10)
            mList.add(i)
        return mList
    }


}