package com.ziroom.kotlindemo.chapter2.yanchi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.ziroom.kotlindemo.R;

/**
 * 延时初始化
 */
public class YanshiActivity extends Activity {
    private TextView tvNameview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yanshi);
        tvNameview = findViewById(R.id.tv_nameview);
    }
}
