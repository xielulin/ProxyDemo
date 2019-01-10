package com.xll.stat;

/**
 * @author xielulin
 * @create 2019-01-10 11:24
 * @desc 代理人
 **/
public class Businessman implements ManFactory{
    private ManFactory factory;

    public Businessman(ManFactory factory){
        super();
        this.factory = factory;
    }

    @Override
    public void saleTools(int size) {
        doSomethingBefore();
        factory.saleTools(size);
        doSomethingAfter();

    }

    private void doSomethingBefore() {
        System.out.println("前置增强");
    }

    private void doSomethingAfter() {
        System.out.println("后置增强");
    }

}
