package com.ziroom.kotlindemo.chapter7.neibulei;

import androidx.annotation.NonNull;

//java中匿名内部类
public class ningmingjava {
    public static void main(String[] args) {
        new Runnable() {
            @Override
            public void run() {

            }
        };

        //本地类
        class LocalClass implements Cloneable, Runnable {

            @Override
            public void run() {

            }
        }
    }
}
