package com.xll.proxy.factory;

import com.xll.proxy.factory.ManFactory;

/**
 * @author xielulin
 * @create 2019-01-10 11:21
 * @desc 工厂类
 **/
public class AaFactory implements ManFactory {
    @Override
    public void saleTools(int size) {
        System.out.println("生产了一个size为"+size+"的男性商品");
    }
}