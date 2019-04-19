package com.xll.singleton;

/**
 * @author xielulin
 * @create 2019-01-11 17:44
 * @desc 懒汉模式（线程不安全）不可用
 **/
public class Singleton3 {
    private static Singleton3 INSTANCE;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
}
