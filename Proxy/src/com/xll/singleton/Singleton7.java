package com.xll.singleton;


/**
 * @author xielulin
 * @create 2019-01-12 09:56
 * @desc 静态内部类（推荐)
 **/
public class Singleton7 {
    private Singleton7(){}

    private static class SingletonInstance{
        private static final Singleton7 INSTANCE = new Singleton7();
    }

    public static Singleton7 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
