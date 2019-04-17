package com.xll.consumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

/**
 * @author xielulin
 * @create 2019-04-17 10:37
 * @desc 生产者
 **/
public class Producer implements Runnable{
    private final BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        while (true) try {
            sleep(2000);
            produce();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void produce() {
        int n = new Random().nextInt(1000);
        queue.add(n);
        System.out.println(currentThread().getId()+"produce n:"+n);
        System.out.println("**************************");
    }
}
