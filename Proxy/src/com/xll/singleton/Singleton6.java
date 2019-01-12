package com.xll.singleton;

/**
 * @author xielulin
 * @create 2019-01-11 17:59
 * @desc 双重检查（线程安全）推荐使用
 **/
public class Singleton6 {
    private static Singleton6  INSTANCE;

    private Singleton6(){}

    public static Singleton6 getInstance(){
        if(INSTANCE == null){
            synchronized (Singleton6.class){
                if(INSTANCE == null){}
                INSTANCE = new Singleton6();
            }
        }
        return INSTANCE;
    }
}
