package com.xll.lock;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xielulin
 * @create 2019-04-30 11:29
 * @desc 测试乐观锁和悲观锁
 **/
public class Test {
    private static int value1 = 0;
    private static AtomicInteger value2 = new AtomicInteger(0);
    private static int value3 = 0;

    private static synchronized void increaseValue3(){
        value3++;
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i<100; i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    value1++;
                    value2.incrementAndGet();
                    increaseValue3();
                }
            }).start();
        }
        Thread.sleep(100);
        System.out.println("线程不安全：value1 = "+value1);
        System.out.println("乐观锁（AtomicInteger）value2 = "+value2);
        System.out.println("悲观锁（Synchronized）value3 = "+value3);
    }
}
