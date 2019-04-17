package com.xll.consumer;

import java.util.concurrent.BlockingQueue;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * @author xielulin
 * @create 2019-04-17 10:32
 * @desc 消费者
 **/
public class Consumer implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

        while (true){
            try {
                sleep(1000);
                consumer(queue.take());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void consumer(Integer take) {
        System.out.println(currentThread().getId()+"consumer n:"+take);
        System.out.println("******************");
    }
}
