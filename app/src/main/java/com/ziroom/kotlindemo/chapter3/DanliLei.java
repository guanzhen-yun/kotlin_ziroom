package com.ziroom.kotlindemo.chapter3;
//单例类 调用kotlin单例
public class DanliLei {
    public static void main(String[] args) {
        String name = AA.INSTANCE.getName();
        String m = AA.m;
        int x = AA.getX();
        int y = AA.y;
        AA.getGender();
        Foo.y();//伴生对象
        Foo.Companion.z();
    }

    public void get() {
        Foo foo = new Foo();
        int x = foo.x;
    }
}
