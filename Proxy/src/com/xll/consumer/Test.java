package com.xll.consumer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author xielulin
 * @create 2019-04-17 10:41
 * @desc 测试
 **/
public class Test {


    public static void main(String[]args){
        ExecutorService service = Executors.newFixedThreadPool(5);
        BlockingQueue<Integer> queue = new LinkedBlockingDeque<>();
        Consumer consumer1 = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);
        Producer producer = new Producer(queue);
        service.execute(producer);
        service.execute(consumer1);
        service.execute(consumer2);
    }
}
