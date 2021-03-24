package com.ziroom.kotlindemo.zy4.zuoye;

import static com.ziroom.kotlindemo.zy4.zuoye.TestPC.queue;

public class Consumer implements Runnable {
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (queue){
                if(!queue.isEmpty()){
                    queue.poll();
                    System.out.println(Thread.currentThread().getName()+"消费商品");
                } else {
                    System.out.println("消费者达到最大数量等待");
                    queue.notify();
                }
            }
        }
    }
}
