package com.ziroom.kotlindemo.zy4.zuoye;

import static com.ziroom.kotlindemo.zy4.zuoye.TestPC.MAX_POOL;
import static com.ziroom.kotlindemo.zy4.zuoye.TestPC.queue;

public class Producer implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (queue) {

                Goods goods = new Goods(1, "商品");
                if (queue.size()<MAX_POOL) {
                    queue.add(goods);
                    System.out.println(Thread.currentThread().getName()+"生产商品");
                } else {
                    System.out.println("生产者达到最大数量等待");
                    try {
                        queue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}