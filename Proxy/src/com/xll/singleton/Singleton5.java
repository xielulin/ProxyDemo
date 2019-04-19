package com.xll.singleton;

/**
 * @author xielulin
 * @create 2019-01-11 17:54
 * @desc 懒汉模式（线程安全）不可用
 * 假如一个线程进入了if (singleton == null)判断语句块，
 * 还未来得及往下执行，另一个线程也通过了这个判断语句，
 * 这时便会产生多个实例。
 **/
public class Singleton5 {
    private static Singleton5 INSTANCE;

    private Singleton5() {
    }

    public static Singleton5 getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton5.class) {
                INSTANCE = new Singleton5();
            }
        }
        return INSTANCE;
    }
}
