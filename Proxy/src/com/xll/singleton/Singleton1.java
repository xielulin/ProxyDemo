package com.xll.singleton;

/**
 * @author xielulin
 * @create 2019-01-11 17:36
 * @desc 单例的7种实现
 * 饿汉式（静态常量）[可用]
 **/
public class Singleton1 {
    private final static Singleton1 INSTANECE = new Singleton1();

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        return INSTANECE;
    }

}
