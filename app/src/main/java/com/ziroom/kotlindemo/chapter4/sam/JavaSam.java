package com.ziroom.kotlindemo.chapter4.sam;

public class JavaSam {

    public static void main(String[] args) {
        submit(() -> { //java是可以支持接口SAM的

        });
    }

    static void submit(Invokable invokable) {
        invokable.invoke();
    }

    interface IInvokable {
        void invoke();
    }
}


