package com.xll.dynamic;

/**
 * @author xielulin
 * @create 2019-01-10 11:21
 * @desc 工厂类
 **/
public class BbFactory implements WomanFactory{
    @Override
    public void saleTools(int height) {
        System.out.println("生产了一个height为"+height+"的商品");
    }
}
