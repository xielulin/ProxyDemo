package com.xll.singleton;

/**
 * @author xielulin
 * @create 2019-01-11 17:49
 * @desc 懒汉模式（线程安全，加锁粒度太大，不推荐）
 **/
public class Singleton4 {
    private static Singleton4 INSTANCE;

    private Singleton4(){}

    public static synchronized Singleton4 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Singleton4();
        }
        return INSTANCE;
    }
}
